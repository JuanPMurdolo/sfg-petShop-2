package globallogic.juanmurdolo.sfgpetclinic.servicios.map;

import globallogic.juanmurdolo.sfgpetclinic.model.Especialidad;
import globallogic.juanmurdolo.sfgpetclinic.model.Mascota;
import globallogic.juanmurdolo.sfgpetclinic.servicios.EspecialidadService;
import globallogic.juanmurdolo.sfgpetclinic.servicios.MascotaService;

import java.util.Set;

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
