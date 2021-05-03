package globallogic.juanmurdolo.sfgpetclinic.servicios;

import globallogic.juanmurdolo.sfgpetclinic.model.Mascota;

import java.util.Set;

public interface MascotaService {

    Mascota findById(Long id);

    Mascota save(Mascota mascota);

    Set<Mascota> findAll();

}
