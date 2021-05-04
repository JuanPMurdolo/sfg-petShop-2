package globallogic.juanmurdolo.sfgpetclinic.servicios;

import globallogic.juanmurdolo.sfgpetclinic.model.Veterinario;

import java.util.Set;

public interface VeterinarioService extends CrudService<Veterinario, Long> {

    Veterinario findByApellido(String apellido);
}
