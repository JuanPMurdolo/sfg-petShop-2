package globallogic.juanmurdolo.sfgpetclinic.model;

import java.time.LocalDate;

public class Visita extends BaseEntity{

    private LocalDate fecha;
    private String descripcion;
    private Mascota mascota;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
