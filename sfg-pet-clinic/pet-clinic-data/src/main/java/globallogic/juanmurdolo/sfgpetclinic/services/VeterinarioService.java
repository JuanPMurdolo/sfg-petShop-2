package globallogic.juanmurdolo.sfgpetclinic.services;

import globallogic.juanmurdolo.sfgpetclinic.model.Veterinario;

public interface VeterinarioService extends CrudService<Veterinario, Long> {

    Veterinario findByApellido(String apellido);
}
