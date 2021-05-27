package globallogic.juanmurdolo.sfgpetclinic.repositories;

import globallogic.juanmurdolo.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByApellido(String apellido);

    List<Owner> findAllByApellidoContainingIgnoreCase(String apellido);
}
