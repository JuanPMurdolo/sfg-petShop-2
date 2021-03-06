package globallogic.juanmurdolo.sfgpetclinic.services.map;

import globallogic.juanmurdolo.sfgpetclinic.model.Especialidad;
import globallogic.juanmurdolo.sfgpetclinic.services.EspecialidadService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class EspecialidadMapService extends AbstractMapService<Especialidad, Long> implements EspecialidadService {


    @Override
    public Set<Especialidad> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Especialidad object) {
        super.delete(object);
    }

    @Override
    public Especialidad save(Especialidad object) {
        return super.save(object);
    }

    @Override
    public Especialidad findById(Long id) {
        return super.findById(id);
    }
}
