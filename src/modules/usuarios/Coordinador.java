package modules.usuarios;

import java.util.Scanner;
import back.Grupo;

public class Coordinador extends Usuario {
    private int numeroEmpleado;

    public Coordinador(String nombre, String correo, String contraseña, int numeroEmpleado) {
        super(nombre, correo, contraseña, "Coordinador");
        this.numeroEmpleado = numeroEmpleado;
    }



    public void cerrarGrupo(Grupo grupo) {
        if (grupo == null) {
            System.out.println("Error: el grupo no puede ser nulo.");
            return;
        }
        grupo.cerrarGrupo();
        
    }

    public void crearGrupo(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("ID del grupo: ");
            int idGrupo;
            try {
                idGrupo = Integer.parseInt(sc.nextLine().trim());
                if (idGrupo <= 0) {
                    System.out.println("Error: el ID del grupo debe ser un número entero positivo.");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: entrada no válida para el ID del grupo.");
                return;
            }

            System.out.print("Capacidad máxima de miembros: ");
            int cupoMaximo;
            try {
                cupoMaximo = Integer.parseInt(sc.nextLine().trim());
                if (cupoMaximo <= 0) {
                    System.out.println("Error: la capacidad debe ser un número entero positivo.");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: entrada no válida para la capacidad.");
                return;
            }

            Grupo nuevoGrupo = new Grupo(idGrupo, cupoMaximo, cupoMaximo, "Activo");
            nuevoGrupo.abrirGrupo();
        }
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }   
}


