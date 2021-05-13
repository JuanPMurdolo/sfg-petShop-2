package globallogic.juanmurdolo.sfgpetclinic.services.springdatajpa;

import globallogic.juanmurdolo.sfgpetclinic.model.Veterinario;
import globallogic.juanmurdolo.sfgpetclinic.model.Visita;
import globallogic.juanmurdolo.sfgpetclinic.repositories.MascotaRepository;
import globallogic.juanmurdolo.sfgpetclinic.repositories.VeterinarioRepository;
import globallogic.juanmurdolo.sfgpetclinic.repositories.VisitaRepository;
import globallogic.juanmurdolo.sfgpetclinic.services.VeterinarioService;
import globallogic.juanmurdolo.sfgpetclinic.services.VisitaService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitaSDJpa implements VisitaService {

    private final VisitaRepository visitaRepository;
    private final MascotaRepository mascotaRepository;

    public VisitaSDJpa(VisitaRepository visitaRepository, MascotaRepository mascotaRepository) {
        this.visitaRepository = visitaRepository;
        this.mascotaRepository = mascotaRepository;
    }

    @Override
    public Set<Visita> findAll() {
        Set<Visita> visitas = new HashSet<>();
        visitaRepository.findAll().forEach(visitas::add);
        return visitas;
    }

    @Override
    public Visita findById(Long aLong) {
        return visitaRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visita save(Visita object) {
        return visitaRepository.save(object);
    }

    @Override
    public void delete(Visita object) {
        visitaRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitaRepository.deleteById(aLong);
    }
}
