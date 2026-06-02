package back;

import java.util.ArrayList;
import java.util.List;

public class Aula {

    private int    idAula;
    private String nombre;
    private int    capacidad;
    private String ubicacion;
    private List<Grupo> grupos;

    public Aula(int idAula, String nombre, int capacidad, String ubicacion) {
        this.idAula    = idAula;
        this.nombre    = nombre;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.grupos    = new ArrayList<>();
    }

 
    public int getIdAula() {
        return idAula;
    }

    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public boolean consultarDisponibilidad() {

        if (this.grupos.isEmpty()) {
            return true;
        }
        return false;
    }

    public void asignarGrupo(Grupo grupo) {
        if (grupo == null) {
            throw new IllegalArgumentException("El grupo no puede ser nulo");
        }
        
        if (grupo.getCupoMaximo() > this.capacidad) {
            throw new IllegalArgumentException(
                "El cupo máximo del grupo " + grupo.getCupoMaximo() + " excede la capacidad del aula " + this.capacidad);
        }
        
        if (!this.consultarDisponibilidad()) {
            throw new IllegalStateException("El aula " + this.nombre + " no está disponible");
        }
        
        if (!this.grupos.contains(grupo)) {
            this.grupos.add(grupo);
            grupo.setAula(this);
            System.out.println("Grupo " + grupo.getIdGrupo() + " asignado al aula " + this.nombre);
        }
    }
}
