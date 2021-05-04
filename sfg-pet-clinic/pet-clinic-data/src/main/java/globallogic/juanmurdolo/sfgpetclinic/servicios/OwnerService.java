package globallogic.juanmurdolo.sfgpetclinic.servicios;

import globallogic.juanmurdolo.sfgpetclinic.model.Owner;
import java.util.Set;

public interface OwnerService  extends  CrudService<Owner, Long>{

    Owner findByApellido(String apellido);

}
