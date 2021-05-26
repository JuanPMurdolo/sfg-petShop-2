package globallogic.juanmurdolo.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "types")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PetType extends BaseEntity{

    @Column(name = "nombre")
    private String nombre;

    @Override
    public String toString() {
        return nombre;
    }
}
