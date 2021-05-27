package globallogic.juanmurdolo.sfgpetclinic.services.springdatajpa;

import globallogic.juanmurdolo.sfgpetclinic.model.Owner;
import globallogic.juanmurdolo.sfgpetclinic.repositories.MascotaRepository;
import globallogic.juanmurdolo.sfgpetclinic.repositories.OwnerRepository;
import globallogic.juanmurdolo.sfgpetclinic.repositories.PetTypeRepository;
import globallogic.juanmurdolo.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpa implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final MascotaRepository mascotaRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpa(OwnerRepository ownerRepository, MascotaRepository mascotaRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.mascotaRepository = mascotaRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
     ownerRepository.deleteById(aLong);
    }

    @Override
    public Owner findByApellido(String apellido) {
        return ownerRepository.findByApellido(apellido);
    }

    @Override
    public List<Owner> findAllByApellidoLike(String apellido) {
        return ownerRepository.findAllByApellido(apellido);
    }
}
