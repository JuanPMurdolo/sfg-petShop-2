package globallogic.juanmurdolo.sfgpetclinic.servicios;

import globallogic.juanmurdolo.sfgpetclinic.model.Owner;
import java.util.Set;

public interface OwnerService  {

    Owner findByApellido(String apellido);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();




}
