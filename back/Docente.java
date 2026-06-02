package back;

import java.util.ArrayList;
import java.util.List;

public class Docente {

    private int    idDocente;
    private String nombre;
    private String especialidad;

    private List<Grupo> grupos;

    public Docente(int idDocente, String nombre, String especialidad) {
        this.idDocente    = idDocente;
        this.nombre       = nombre;
        this.especialidad = especialidad;
        this.grupos       = new ArrayList<>(); 
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public void consultarHorario() {
        System.out.println(" HORARIO DEL DOCENTE: " + this.nombre);
        
        if (this.grupos.isEmpty()) {
            System.out.println(" Sin grupos asignados.");
            return;
        }
        
        for (Grupo grupo : this.grupos) {
            if (grupo.getHorario() != null) {
                Horario h = grupo.getHorario();
                System.out.println(" Grupo " + grupo.getIdGrupo() + 
                                 ": " + h.getDia() + " de " + 
                                 h.getHoraInicio() + " a " + h.getHoraFin() +
                                 " Materia: " + (grupo.getMateria() != null ? grupo.getMateria().getNombre() : "Ninguna"));
            }
        }
    }
}
