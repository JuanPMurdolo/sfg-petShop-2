package globallogic.juanmurdolo.sfgpetclinic.services.map;

import globallogic.juanmurdolo.sfgpetclinic.model.Visita;
import globallogic.juanmurdolo.sfgpetclinic.services.VisitaService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VisitaMapService extends AbstractMapService<Visita, Long> implements VisitaService {



    @Override
    public Set<Visita> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public void delete(Visita object) {
    super.delete(object);
    }

    @Override
    public Visita save(Visita object) {
        if (object.getMascota() == null || object.getMascota().getOwner() == null || object.getMascota().getId() == null
                || object.getMascota().getOwner().getId() == null){
            throw new RuntimeException("visita invalida");
        }
        return super.save(object);
    }

    @Override
    public Visita findById(Long id) {
        return super.findById(id);
    }
}
