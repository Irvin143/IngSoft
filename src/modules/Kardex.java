package modules;

import java.util.List;
import back.Materia;

public class Kardex {
    private int idKardex;
    private double promedioGeneral;
    private int creditosAcumulados;

    private List<Materia> materias;


    public Kardex() {
        this.idKardex = 0;
        this.promedioGeneral = 0.0;
        this.creditosAcumulados = 0;
    }

    public void consultarHistorial() {
        if (materias == null || materias.isEmpty()) {
            System.out.println("No hay materias registradas en el kardex.");
            return;
        }

        for (Materia materia : materias) {
            if (materia != null) {
                System.out.println("Materia: " + materia.getNombre() + ", Créditos: " + materia.getCreditos());
            }
        }
    }

    public double calcularPromedioGeneral() {
        if (materias == null || materias.isEmpty()) {
            return 0.0;
        }

        double totalCalificaciones = 0.0;
        int totalCreditos = 0;

        for (Materia materia : materias) {
            if (materia != null) {
                int calificacion = materia.getCalificacion();
                totalCalificaciones += calificacion * materia.getCreditos();
                totalCreditos += materia.getCreditos();
            }
        }

        return totalCreditos > 0 ? totalCalificaciones / totalCreditos : 0.0;
    }

    public void generarReporte() {
        System.out.println("Kardex ID: " + idKardex);
        System.out.println("Promedio General: " + promedioGeneral);
        System.out.println("Créditos Acumulados: " + creditosAcumulados);
        consultarHistorial();
    }


    public int getIdKardex() {
        return idKardex;
    }

    public void setIdKardex(int idKardex) {
        this.idKardex = idKardex;
    }

    public double getPromedioGeneral() {
        return promedioGeneral;
    }

    public void setPromedioGeneral(double promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }

    public int getCreditosAcumulados() {
        return creditosAcumulados;
    }

    public void setCreditosAcumulados(int creditosAcumulados) {
        this.creditosAcumulados = creditosAcumulados;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public void agregarMateria(Materia materia) {
        if (materia == null) {
            System.out.println("Error: la materia no puede ser nula.");
            return;
        }
        materias.add(materia);
        creditosAcumulados += materia.getCreditos();
        promedioGeneral = calcularPromedioGeneral();
    }

}
