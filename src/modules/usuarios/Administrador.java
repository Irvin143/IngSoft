package modules.usuarios;

public class Administrador extends Usuario {
    private int numeroEmpleado;

    public Administrador(String nombre, String correo, String contraseña, int numeroEmpleado) {
        super(nombre, correo, contraseña, "Administrador");
        this.numeroEmpleado = numeroEmpleado;
    }

    public void gestionarUsuarios() {
        // Lógica para gestionar usuarios (crear, editar, eliminar)
        System.out.println("Gestionando usuarios...");
    }

    public void gestionarCarreras() {
        // Lógica para generar reportes del sistema
        System.out.println("Generando reportes...");
    }

    public void gestionarPlanes(){
        // Lógica para gestionar planes de estudio
        System.out.println("Gestionando planes de estudio...");
    }
}
