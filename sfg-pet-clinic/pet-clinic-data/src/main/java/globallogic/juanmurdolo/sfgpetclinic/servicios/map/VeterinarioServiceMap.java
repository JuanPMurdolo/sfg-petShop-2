package globallogic.juanmurdolo.sfgpetclinic.servicios.map;


import globallogic.juanmurdolo.sfgpetclinic.model.Veterinario;
import globallogic.juanmurdolo.sfgpetclinic.servicios.CrudService;
import globallogic.juanmurdolo.sfgpetclinic.servicios.VeterinarioService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VeterinarioServiceMap extends AbstractMapService<Veterinario, Long> implements VeterinarioService {

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
        return super.save(object.getId(), object);
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
