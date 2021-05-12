package globallogic.juanmurdolo.sfgpetclinic.repositories;

import globallogic.juanmurdolo.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String apellido);


}
