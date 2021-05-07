package globallogic.juanmurdolo.sfgpetclinic.model;

import java.util.Set;

public class Veterinario extends Person{

    private Set<Especialidad> especialidad;

    public Set<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Set<Especialidad> especialidad) {
        this.especialidad = especialidad;
    }
}
