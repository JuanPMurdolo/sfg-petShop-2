package globallogic.juanmurdolo.sfgpetclinic.bootstrap;

import globallogic.juanmurdolo.sfgpetclinic.model.*;
import globallogic.juanmurdolo.sfgpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VeterinarioService vetService;
    private final PetTypeService petTypeService;
    private final EspecialidadService specialtyService;
    private final VisitaService visitService;


    public DataLoader(OwnerService ownerService, VeterinarioService vetService, PetTypeService petTypeService, EspecialidadService specialtyService, VisitaService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0 ){
            loadData();
        }
    }

    private void loadData(){
        PetType dog = new PetType();
        dog.setNombre("Perro");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setNombre("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Especialidad radiology = new Especialidad();
        radiology.setDescripcion("Radiology");
        Especialidad savedRadiology = specialtyService.save(radiology);

        Especialidad surgery = new Especialidad();
        surgery.setDescripcion("Surgery");
        Especialidad savedSurgery = specialtyService.save(surgery);

        Especialidad dentistry = new Especialidad();
        dentistry.setDescripcion("dentistry");
        Especialidad savedDentistry = specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setNombre("Michael");
        owner1.setApellido("Weston");
        owner1.setDireccion("123 Brickerel");
        owner1.setCiudad("Miami");
        owner1.setTelefono("1231231234");

        Mascota mikesPet = new Mascota();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setFechaNacimiento(LocalDate.now());
        mikesPet.setNombre("Rosco");
        owner1.getMascotas().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setNombre("Fiona");
        owner2.setApellido("Glenanne");
        owner2.setDireccion("123 Brickerel");
        owner2.setCiudad("Miami");
        owner2.setTelefono("1231231234");

        Mascota fionasCat = new Mascota();
        fionasCat.setNombre("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setFechaNacimiento(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getMascotas().add(fionasCat);

        ownerService.save(owner2);

        Visita catVisit = new Visita();
        catVisit.setMascota(fionasCat);
        catVisit.setFecha(LocalDate.now());
        catVisit.setDescripcion("Sneezy Kitty");

        visitService.save(catVisit);

        System.out.println("Loaded Owners....");

        Veterinario vet1 = new Veterinario();
        vet1.setNombre("Sam");
        vet1.setApellido("Axe");
        vet1.getEspecialidad().add(savedRadiology);

        vetService.save(vet1);

        Veterinario vet2 = new Veterinario();
        vet2.setNombre("Jessie");
        vet2.setApellido("Porter");
        vet2.getEspecialidad().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }

}
