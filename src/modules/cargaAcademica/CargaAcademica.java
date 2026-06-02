package modules.cargaAcademica;

import java.util.List;
import back.Materia;

public class CargaAcademica {
    private String fecha;
    private int totalCreditos;
    private String estado; // "Pendiente", "Confirmada", "Rechazada"    

    private List<Materia> materias;
    
    public CargaAcademica(String fecha, int totalCreditos, String estado) {
        this.fecha = fecha;
        this.totalCreditos = totalCreditos;
        this.estado = estado;
    }

    private void agregarMateria(Materia materia) {
        materias.add(materia);
        totalCreditos += materia.getCreditos();
        System.out.println("Materia " + materia.getNombre() + " agregada a la carga académica.");
    }

    private void eliminarMateria(Materia materia) {
        materias.remove(materia);
        totalCreditos -= materia.getCreditos();
        System.out.println("Materia " + materia.getNombre() + " eliminada de la carga académica.");
    }

    private boolean validarCreditos() {
        if (totalCreditos > 30) {
            return false;
        } else {
            return true;
        }
    }

    private boolean confirmarCarga() {
        if (validarCreditos()) {
            estado = "Confirmada";
        } else {
            estado = "Rechazada";
            return false;
        }
        if(materias == null) {
            return false;
        }
        return true;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTotalCreditos() {
        return totalCreditos;
    }

    public void setTotalCreditos(int totalCreditos) {
        this.totalCreditos = totalCreditos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}
