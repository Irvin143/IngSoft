package back;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    private int    idCarrera;
    private String clave;
    private String nombre;
    private List<PlanEstudios> planesDeEstudio;

    public Carrera(int idCarrera, String clave, String nombre) {
        this.idCarrera       = idCarrera;
        this.clave           = clave;
        this.nombre          = nombre;
        this.planesDeEstudio = new ArrayList<>(); 
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<PlanEstudios> getPlanesDeEstudio() {
        return planesDeEstudio;
    }

    public void setPlanesDeEstudio(List<PlanEstudios> planesDeEstudio) {
        this.planesDeEstudio = planesDeEstudio;
    }

    public void agregarCarrera() {
        if (this.clave == null || this.clave.isEmpty()) {
            throw new IllegalArgumentException("La clave de la carrera no puede estar vacía");
        }
        if (this.nombre == null || this.nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre de la carrera no puede estar vacío");
        }
        System.out.println("Carrera " + this.nombre + " registrada exitosamente en el sistema.");
    }

    public void eliminarCarrera() {
        if (!this.planesDeEstudio.isEmpty()) {
            throw new IllegalStateException(
                "No se puede eliminar la carrera " + this.nombre + " porque tiene " + this.planesDeEstudio.size() + " planes de estudio asociados.");
        }
        System.out.println("Carrera " + this.nombre + " eliminada del sistema.");
    }
}
