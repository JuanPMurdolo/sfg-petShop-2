package globallogic.juanmurdolo.sfgpetclinic.bootstrap;

import globallogic.juanmurdolo.sfgpetclinic.model.Owner;
import globallogic.juanmurdolo.sfgpetclinic.model.Veterinario;
import globallogic.juanmurdolo.sfgpetclinic.servicios.OwnerService;
import globallogic.juanmurdolo.sfgpetclinic.servicios.VeterinarioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VeterinarioService veterinarioService;




    public DataLoader(OwnerService ownerService, VeterinarioService veterinarioService) {
        this.ownerService = ownerService;
        this.veterinarioService = veterinarioService;
    }

    @Override
    public void run(String... args) throws Exception {
    Owner owner1 = new Owner();
    owner1.setId(1L);
    owner1.setNombre("Jorge");
    owner1.setApellido("Uno");

    ownerService.save(owner1);

    Veterinario vet1 = new Veterinario();
    vet1.setId(1L);
    vet1.setApellido("Dos");
    vet1.setNombre("Ironman");

    veterinarioService.save(vet1);
    }
}
