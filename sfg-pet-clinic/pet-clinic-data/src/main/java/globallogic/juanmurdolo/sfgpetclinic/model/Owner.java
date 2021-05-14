package globallogic.juanmurdolo.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="owners")
public class Owner extends Person{

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Mascota> mascotas = new HashSet<>();

    @Column(name="direccion")
    private String direccion;

    @Column(name="ciudad")
    private String ciudad;

    @Column(name="telefono")
    private String telefono;

    @Builder
    public Owner(Long id, String nombre, String apellido, Set<Mascota> mascotas, String direccion, String ciudad, String telefono) {
        super(id, nombre, apellido);
        this.mascotas = mascotas;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }


}
