package globallogic.juanmurdolo.sfgpetclinic.model;

import java.util.Set;

public class Owner extends Person{

    private Set<Mascota> mascotas;

    public Set<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(Set<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
