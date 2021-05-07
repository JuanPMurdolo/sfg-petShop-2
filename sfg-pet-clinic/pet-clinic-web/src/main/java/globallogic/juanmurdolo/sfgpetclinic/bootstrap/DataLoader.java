package globallogic.juanmurdolo.sfgpetclinic.bootstrap;

import globallogic.juanmurdolo.sfgpetclinic.model.Mascota;
import globallogic.juanmurdolo.sfgpetclinic.model.Owner;
import globallogic.juanmurdolo.sfgpetclinic.model.PetType;
import globallogic.juanmurdolo.sfgpetclinic.model.Veterinario;
import globallogic.juanmurdolo.sfgpetclinic.servicios.OwnerService;
import globallogic.juanmurdolo.sfgpetclinic.servicios.PetTypeService;
import globallogic.juanmurdolo.sfgpetclinic.servicios.VeterinarioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VeterinarioService veterinarioService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VeterinarioService veterinarioService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.veterinarioService = veterinarioService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
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

    veterinarioService.save(vet1);
    }


}
