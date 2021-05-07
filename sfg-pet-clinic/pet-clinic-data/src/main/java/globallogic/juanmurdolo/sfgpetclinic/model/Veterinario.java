package globallogic.juanmurdolo.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Veterinario extends Person{

    private Set<Especialidad> especialidad = new HashSet<>();

    public Set<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Set<Especialidad> especialidad) {
        this.especialidad = especialidad;
    }
}
