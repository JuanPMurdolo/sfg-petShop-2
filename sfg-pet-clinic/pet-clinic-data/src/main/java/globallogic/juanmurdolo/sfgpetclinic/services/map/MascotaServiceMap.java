package globallogic.juanmurdolo.sfgpetclinic.services.map;

import globallogic.juanmurdolo.sfgpetclinic.model.Mascota;
import globallogic.juanmurdolo.sfgpetclinic.services.MascotaService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default", "map"})
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
        return super.save(object);
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
