package globallogic.juanmurdolo.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
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


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Set<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(Set<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
