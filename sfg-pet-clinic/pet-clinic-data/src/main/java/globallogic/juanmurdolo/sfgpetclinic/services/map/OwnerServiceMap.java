package globallogic.juanmurdolo.sfgpetclinic.services.map;

import globallogic.juanmurdolo.sfgpetclinic.model.Mascota;
import globallogic.juanmurdolo.sfgpetclinic.model.Owner;
import globallogic.juanmurdolo.sfgpetclinic.services.MascotaService;
import globallogic.juanmurdolo.sfgpetclinic.services.OwnerService;
import globallogic.juanmurdolo.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final MascotaService mascotaService;

    public OwnerServiceMap(PetTypeService petTypeService, MascotaService mascotaService) {
        this.petTypeService = petTypeService;
        this.mascotaService = mascotaService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findall();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if (object != null){
            if (object.getMascotas() != null){
                object.getMascotas().forEach(pet -> {if (pet.getPetType() != null){
                    if (pet.getPetType().getId() == null){
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    }
                }else{
                    throw new RuntimeException("Pet Type es requerido");
                }
                if (pet.getId() == null){
                    Mascota savedPet = mascotaService.save(pet);
                    pet.setId(savedPet.getId());
                }
                });
            }
        return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByApellido(String apellido) {
        return null;
    }


}
