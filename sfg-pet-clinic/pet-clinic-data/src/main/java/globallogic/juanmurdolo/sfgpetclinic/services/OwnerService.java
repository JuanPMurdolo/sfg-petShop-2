package globallogic.juanmurdolo.sfgpetclinic.services;

import globallogic.juanmurdolo.sfgpetclinic.model.Owner;

import java.util.List;

public interface OwnerService  extends  CrudService<Owner, Long>{

    Owner findByApellido(String apellido);

    List<Owner> findAllByApellidoLike(String apellido);

}
