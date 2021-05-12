package globallogic.juanmurdolo.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "veterinarios")
public class Veterinario extends Person{

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable (name = "vet_especialidades", joinColumns = @JoinColumn(name = "veterinario_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_id"))
    private Set<Especialidad> especialidad = new HashSet<>();

    public Set<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Set<Especialidad> especialidad) {
        this.especialidad = especialidad;
    }
}
