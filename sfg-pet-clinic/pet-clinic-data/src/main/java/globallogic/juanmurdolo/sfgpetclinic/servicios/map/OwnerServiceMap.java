package globallogic.juanmurdolo.sfgpetclinic.servicios.map;

import globallogic.juanmurdolo.sfgpetclinic.model.Owner;
import globallogic.juanmurdolo.sfgpetclinic.servicios.CrudService;
import globallogic.juanmurdolo.sfgpetclinic.servicios.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findall();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByApellido(String apellido) {
        return null;
    }


}
