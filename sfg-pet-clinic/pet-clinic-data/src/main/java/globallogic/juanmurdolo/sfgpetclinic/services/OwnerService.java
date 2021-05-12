package globallogic.juanmurdolo.sfgpetclinic.services;

import globallogic.juanmurdolo.sfgpetclinic.model.Owner;

public interface OwnerService  extends  CrudService<Owner, Long>{

    Owner findByApellido(String apellido);

}
