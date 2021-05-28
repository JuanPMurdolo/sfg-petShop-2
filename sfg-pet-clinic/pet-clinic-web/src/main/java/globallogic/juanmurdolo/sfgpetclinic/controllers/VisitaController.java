package globallogic.juanmurdolo.sfgpetclinic.controllers;

import globallogic.juanmurdolo.sfgpetclinic.model.Mascota;
import globallogic.juanmurdolo.sfgpetclinic.model.Visita;
import globallogic.juanmurdolo.sfgpetclinic.services.MascotaService;
import globallogic.juanmurdolo.sfgpetclinic.services.VisitaService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.util.Map;

@Controller
public class VisitaController {

    private final VisitaService visitaService;
    private final MascotaService petService;

    public VisitaController(VisitaService visitaService, MascotaService petService) {
        this.visitaService = visitaService;
        this.petService = petService;
    }

    @InitBinder
    public void dataBinder(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");

        dataBinder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) throws IllegalArgumentException{
                setValue(LocalDate.parse(text));
            }
        });
    }

    /**
     * Called before each and every @RequestMapping annotated method.
     * 2 goals:
     * - Make sure we always have fresh data
     * - Since we do not use the session scope, make sure that Pet object always has an id
     * (Even though id is not part of the form fields)
     *
     * @param petId
     * @return Pet
     */
    @ModelAttribute("visita")
    public Visita loadPetWithVisit(@PathVariable("petId") Long petId, Map<String, Object> model) {
        Mascota pet = petService.findById(petId);
        model.put("mascota", pet);
        Visita visit = new Visita();
        pet.getVisitas().add(visit);
        visit.setMascota(pet);
        return visit;
    }

    @GetMapping("/owners/*/mascotas/{petId}/visitas/new")
    public String initNewVisitForm(@PathVariable("petId") Long petId, Map<String, Object> model) {
        return "pets/createOrUpdateVisitForm";
    }

    // Spring MVC calls method loadPetWithVisit(...) before processNewVisitForm is called
    @PostMapping("/owners/{ownerId}/mascotas/{petId}/visitas/new")
    public String processNewVisitForm(@Valid Visita visit, BindingResult result) {
        if (result.hasErrors()) {
            return "pets/createOrUpdateVisitForm";
        } else {
            visitaService.save(visit);

            return "redirect:/owners/{ownerId}";
        }
    }
}
