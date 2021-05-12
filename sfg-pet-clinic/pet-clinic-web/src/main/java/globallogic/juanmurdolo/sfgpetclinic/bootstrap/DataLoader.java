package globallogic.juanmurdolo.sfgpetclinic.bootstrap;

import globallogic.juanmurdolo.sfgpetclinic.model.*;
import globallogic.juanmurdolo.sfgpetclinic.services.EspecialidadService;
import globallogic.juanmurdolo.sfgpetclinic.services.OwnerService;
import globallogic.juanmurdolo.sfgpetclinic.services.PetTypeService;
import globallogic.juanmurdolo.sfgpetclinic.services.VeterinarioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VeterinarioService veterinarioService;
    private final PetTypeService petTypeService;
    private.final EspecialidadService especialidadService;


    public DataLoader(OwnerService ownerService, VeterinarioService veterinarioService, PetTypeService petTypeService, EspecialidadService especialidadService) {
        this.ownerService = ownerService;
        this.veterinarioService = veterinarioService;
        this.petTypeService = petTypeService;
        this.especialidadService = especialidadService;


    }

    private void loadData(){
        PetType perro = new PetType();
        perro.setNombre("perro");
        PetType saveDogType = petTypeService.save(perro);

        PetType gato = new PetType();
        gato.setNombre("gato");
        PetType saveGatoType = petTypeService.save(gato);

        Owner owner1 = new Owner();
        owner1.setNombre("Jorge");
        owner1.setApellido("Uno");
        owner1.setDireccion("Calle 3");
        owner1.setCiudad("La Plata");
        owner1.setTelefono("2211111111");

        Mascota mascotaDeJorge = new Mascota();
        mascotaDeJorge.setNombre("Michellin");
        mascotaDeJorge.setPetType(perro);
        mascotaDeJorge.setFechaNacimiento(LocalDate.now());

        owner1.getMascotas().add(mascotaDeJorge);

        ownerService.save(owner1);



        Veterinario vet1 = new Veterinario();
        vet1.setApellido("Dos");
        vet1.setNombre("Ironman");

        veterinarioService.save(vet1);}

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count == 0){
            loadData();
        }

    }

}
