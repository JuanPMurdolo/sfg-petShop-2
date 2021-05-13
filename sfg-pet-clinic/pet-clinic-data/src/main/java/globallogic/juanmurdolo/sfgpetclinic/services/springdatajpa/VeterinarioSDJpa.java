package globallogic.juanmurdolo.sfgpetclinic.services.springdatajpa;

import globallogic.juanmurdolo.sfgpetclinic.model.Owner;
import globallogic.juanmurdolo.sfgpetclinic.model.Veterinario;
import globallogic.juanmurdolo.sfgpetclinic.repositories.VeterinarioRepository;
import globallogic.juanmurdolo.sfgpetclinic.services.VeterinarioService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VeterinarioSDJpa implements VeterinarioService {

    private final VeterinarioRepository veterinarioRepository;

    public VeterinarioSDJpa(VeterinarioRepository veterinarioRepository) {
        this.veterinarioRepository = veterinarioRepository;
    }


    @Override
    public Set<Veterinario> findAll() {
        Set<Veterinario> vets = new HashSet<>();
        veterinarioRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Veterinario findById(Long aLong) {
        return veterinarioRepository.findById(aLong).orElse(null);
    }

    @Override
    public Veterinario save(Veterinario object) {
        return veterinarioRepository.save(object);
    }

    @Override
    public void delete(Veterinario object) {
        veterinarioRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        veterinarioRepository.deleteById(aLong);
    }

    @Override
    public Veterinario findByApellido(String apellido) {
        return null;
    }
}
