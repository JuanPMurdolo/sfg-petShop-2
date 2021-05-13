package globallogic.juanmurdolo.sfgpetclinic.services.springdatajpa;

import globallogic.juanmurdolo.sfgpetclinic.model.Especialidad;
import globallogic.juanmurdolo.sfgpetclinic.model.Owner;
import globallogic.juanmurdolo.sfgpetclinic.repositories.EspecialidadRepository;
import globallogic.juanmurdolo.sfgpetclinic.services.EspecialidadService;

import java.util.HashSet;
import java.util.Set;

public class EspecialidadSDJpa implements EspecialidadService {
    private final EspecialidadRepository especialidadRepository;

    public EspecialidadSDJpa(EspecialidadRepository especialidadRepository) {
        this.especialidadRepository = especialidadRepository;
    }

    @Override
    public Set<Especialidad> findAll() {
        Set<Especialidad> especialidad = new HashSet<>();
        especialidadRepository.findAll().forEach(especialidad::add);
        return especialidad;
    }

    @Override
    public Especialidad findById(Long aLong) {
        return especialidadRepository.findById(aLong).orElse(null);
    }

    @Override
    public Especialidad save(Especialidad object) {
        return especialidadRepository.save(object);
    }

    @Override
    public void delete(Especialidad object) {
        especialidadRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        especialidadRepository.deleteById(aLong);
    }
}
