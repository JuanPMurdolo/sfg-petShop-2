package globallogic.juanmurdolo.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Table(name = "veterinarios")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Veterinario extends Person{

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable (name = "vet_especialidades", joinColumns = @JoinColumn(name = "veterinario_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_id"))
    private Set<Especialidad> especialidad = new HashSet<>();

}
