package globallogic.juanmurdolo.sfgpetclinic.servicios.map;


import globallogic.juanmurdolo.sfgpetclinic.model.Especialidad;
import globallogic.juanmurdolo.sfgpetclinic.model.Mascota;
import globallogic.juanmurdolo.sfgpetclinic.model.Veterinario;
import globallogic.juanmurdolo.sfgpetclinic.servicios.CrudService;
import globallogic.juanmurdolo.sfgpetclinic.servicios.EspecialidadService;
import globallogic.juanmurdolo.sfgpetclinic.servicios.VeterinarioService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
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
