package globallogic.juanmurdolo.sfgpetclinic.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "especialidad")
public class Especialidad extends BaseEntity{

    @Column(name = "descripcion")
    private String descripcion;

}
