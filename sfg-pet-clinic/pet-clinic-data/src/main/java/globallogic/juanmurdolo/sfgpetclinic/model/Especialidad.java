package globallogic.juanmurdolo.sfgpetclinic.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "especialidad")
public class Especialidad extends BaseEntity{

    @Column(name = "descripcion")
    private String descripcion;


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
