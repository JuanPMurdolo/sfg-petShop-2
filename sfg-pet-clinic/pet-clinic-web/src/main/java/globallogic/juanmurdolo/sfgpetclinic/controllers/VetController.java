package globallogic.juanmurdolo.sfgpetclinic.controllers;


import globallogic.juanmurdolo.sfgpetclinic.services.VeterinarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    private final VeterinarioService veterinarioService;

    public VetController(VeterinarioService veterinarioService) {
        this.veterinarioService = veterinarioService;
    }


    @RequestMapping({"", "/index",  "/index.html"})
    public String listVets(Model model)
    {
        model.addAttribute("veterinarios", veterinarioService.findAll());

        return "vets/index";
    }

    @RequestMapping("/find")
    public String findVets(Model model){
        return "notimplemented";
    }
}
