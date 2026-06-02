package modules.usuarios;

import back.Materia;
import modules.Kardex;  
import java.util.List;
import java.util.Scanner;
import modules.cargaAcademica.CargaAcademica;

public class Alumno extends Usuario {
    private String matricula;
    private String estatus;

    private Kardex kardex;
    
    public Alumno(String nombre, String correo, String contraseña, String matricula,String estatus) {
        super(nombre, correo, contraseña, "Alumno");
        this.matricula = matricula;
        this.estatus = estatus;
        this.kardex = new Kardex();
    }

    public void consultarKardex() {
        if (kardex == null) {
            System.out.println("Error: el kardex no puede ser nulo.");
            return;
        }
        kardex.consultarHistorial();
    }

    public void consultarHorario(){
        if (kardex == null) {
            System.out.println("Error: el kardex no puede ser nulo.");
            return;
        }
        for (Materia materia : kardex.getMaterias()) {
            if (materia != null) {
                materia.consultarGrupos();
            }
        }
    }

    private void realizarCarga() {
        CargaAcademica carga = new CargaAcademica("2025-2026", 30, "Abierta");
        System.out.println("Qué materias deseas cargar? Ingresa índices separados por comas (ej: 0,2,3):");
        Object materiasObj = carga.getMaterias();
        if (materiasObj instanceof List) {
            List<Materia> lista = (List<Materia>) materiasObj;
            for (int i = 0; i < lista.size(); i++) {
                Materia m = lista.get(i);
                if (m != null) System.out.println(i + ": " + m.getNombre() + " (" + m.getCreditos() + " créditos)");
            }
        } else if (materiasObj instanceof Materia[]) {
            Materia[] arr = (Materia[]) materiasObj;
            for (int i = 0; i < arr.length; i++) {
                Materia m = arr[i];
                if (m != null) System.out.println(i + ": " + m.getNombre() + " (" + m.getCreditos() + " créditos)");
            }
        } else {
            System.out.println("No hay materias disponibles para cargar.");
            for (Materia m : carga.getMaterias()) {
                if (m != null) System.out.println(m.getNombre() + " (" + m.getCreditos() + " créditos)");
            }
        }

        Scanner scanner = new java.util.Scanner(System.in);
        String line = scanner.nextLine();
        String[] parts = line.split("\\s*,\\s*");
        for (String p : parts) {
            try {
                int idx = Integer.parseInt(p);
                Materia toAdd = null;
                if (materiasObj instanceof List) {
                    List<Materia> lista = (List<Materia>) materiasObj;
                    if (idx >= 0 && idx < lista.size()) toAdd = lista.get(idx);
                } else if (materiasObj instanceof Materia[]) {
                    Materia[] arr = (Materia[]) materiasObj;
                    if (idx >= 0 && idx < arr.length) toAdd = arr[idx];
                }
                if (toAdd != null) {
                    try {
                        List<Materia> destino = null;
                        Object destObj = kardex.getMaterias();
                        if (destObj instanceof List) {
                            destino = (List<Materia>) destObj;
                            destino.add(toAdd);
                        } else if (destObj instanceof Materia[]) {
                            Materia[] darr = (Materia[]) destObj;
                            for (int j = 0; j < darr.length; j++) {
                                if (darr[j] == null) { darr[j] = toAdd; break; }
                            }
                        }
                        System.out.println("Materia agregada: " + toAdd.getNombre());
                    } catch (Exception ex) {
                        System.out.println("No se pudo agregar la materia al kardex: " + ex.getMessage());
                    }
                }
            } catch (NumberFormatException ex) {
                System.out.println("Índice no válido: " + p);
            }
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
