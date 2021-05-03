package globallogic.juanmurdolo.sfgpetclinic.servicios;

import globallogic.juanmurdolo.sfgpetclinic.model.Veterinario;

import java.util.Set;

public interface VeterinarioService {
    
    Veterinario findById(Long id);

    Veterinario save(Veterinario veterinario);

    Set<Veterinario> findAll();

}
