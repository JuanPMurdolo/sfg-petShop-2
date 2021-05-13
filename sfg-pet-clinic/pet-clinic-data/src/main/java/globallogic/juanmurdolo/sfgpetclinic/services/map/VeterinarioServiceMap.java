package globallogic.juanmurdolo.sfgpetclinic.services.map;


import globallogic.juanmurdolo.sfgpetclinic.model.Especialidad;
import globallogic.juanmurdolo.sfgpetclinic.model.Veterinario;
import globallogic.juanmurdolo.sfgpetclinic.services.EspecialidadService;
import globallogic.juanmurdolo.sfgpetclinic.services.VeterinarioService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VeterinarioServiceMap extends AbstractMapService<Veterinario, Long> implements VeterinarioService {

    private final EspecialidadService especialidadService;

    public VeterinarioServiceMap(EspecialidadService especialidadService) {
        this.especialidadService = especialidadService;
    }

    @Override
    public Set<Veterinario> findAll() {
        return super.findall();
    }

    @Override
    public Veterinario findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Veterinario save(Veterinario object) {
        if (object != null){
            if (object.getEspecialidad() != null){
                object.getEspecialidad().forEach(especialidad -> {if (especialidad.getId() == null){
                        Especialidad savedEspe = especialidadService.save(especialidad);
                        especialidad.setId(savedEspe.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public void delete(Veterinario object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Veterinario findByApellido(String apellido) {
        return null;
    }
}
