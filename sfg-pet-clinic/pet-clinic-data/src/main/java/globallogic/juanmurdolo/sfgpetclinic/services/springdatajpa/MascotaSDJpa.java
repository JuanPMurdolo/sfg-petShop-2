package globallogic.juanmurdolo.sfgpetclinic.services.springdatajpa;

import globallogic.juanmurdolo.sfgpetclinic.model.Mascota;
import globallogic.juanmurdolo.sfgpetclinic.model.Owner;
import globallogic.juanmurdolo.sfgpetclinic.repositories.MascotaRepository;
import globallogic.juanmurdolo.sfgpetclinic.repositories.PetTypeRepository;
import globallogic.juanmurdolo.sfgpetclinic.services.MascotaService;

import java.util.HashSet;
import java.util.Set;

public class MascotaSDJpa implements MascotaService {

    private final MascotaRepository mascotaRepository;
    private final PetTypeRepository petTypeRepository;

    public MascotaSDJpa(MascotaRepository mascotaRepository, PetTypeRepository petTypeRepository) {
        this.mascotaRepository = mascotaRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<Mascota> findAll() {
        Set<Mascota> mascotas = new HashSet<>();
        mascotaRepository.findAll().forEach(mascotas::add);
        return mascotas;
    }

    @Override
    public Mascota findById(Long aLong) {
        return mascotaRepository.findById(aLong).orElse(null);
    }

    @Override
    public Mascota save(Mascota object) {
        return mascotaRepository.save(object);
    }

    @Override
    public void delete(Mascota object) {
        mascotaRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        mascotaRepository.deleteById(aLong);
    }
}
