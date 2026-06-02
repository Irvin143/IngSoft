package back;

import java.util.ArrayList;
import java.util.List;

public class PlanEstudios {

    private int    idPlan;
    private String nombre;
    private String version;
    private Carrera carrera;
    private List<Materia> materias;
    private List<Grupo> grupos;

    public PlanEstudios(int idPlan, String nombre, String version, Carrera carrera) {
        this.idPlan   = idPlan;
        this.nombre   = nombre;
        this.version  = version;
        this.carrera  = carrera;
        this.materias = new ArrayList<>(); 
        this.grupos   = new ArrayList<>(); 
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public void agregarMateria(Materia materia) {
        if (materia != null) {
            this.materias.add(materia);
        }
    }

    public void eliminarMateria(Materia materia) {
        this.materias.remove(materia);
    }

    public void consultarPlan() {
        System.out.println("    PLAN DE ESTUDIOS: " + this.nombre);
        System.out.println(" Carrera: " + (this.carrera != null ? this.carrera.getNombre() : "Ninguna"));
        System.out.println(" Versión: " + this.version);
        
        if (this.materias.isEmpty()) {
            System.out.println(" Sin materias asignadas");
        } else {
            int creditosTotales = 0;
            System.out.println(" MATERIAS:");
            for (Materia m : this.materias) {
                creditosTotales += m.getCreditos();
                System.out.println(" " + m.getNombre() + " " + m.getCreditos() + " créditos");
            }
            System.out.println("\n TOTAL DE CRÉDITOS: " + creditosTotales);
        }
        System.out.println("\n GRUPOS ACTIVOS: " + this.grupos.size());
    }
}
