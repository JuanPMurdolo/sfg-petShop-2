package globallogic.juanmurdolo.sfgpetclinic.servicios.map;

import globallogic.juanmurdolo.sfgpetclinic.model.Mascota;
import globallogic.juanmurdolo.sfgpetclinic.servicios.CrudService;
import globallogic.juanmurdolo.sfgpetclinic.servicios.MascotaService;

import java.util.Set;

public class MascotaServiceMap extends AbstractMapService<Mascota, Long> implements MascotaService {


    @Override
    public Set<Mascota> findAll() {
        return super.findall();
    }

    @Override
    public Mascota findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Mascota save(Mascota object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Mascota object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
