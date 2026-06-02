package modules.usuarios;

public class Coordinador extends Usuario {
    private int numeroEmpleado;

    public Coordinador(String nombre, String correo, String contraseña, int numeroEmpleado) {
        super(nombre, correo, contraseña, "Coordinador");
        this.numeroEmpleado = numeroEmpleado;
    }

    public void crearGrupo() {
        // Lógica para crear un grupo
        System.out.println("Creando grupo...");
    }

    public void cerrarGrupo() {
        // Lógica para cerrar un grupo
        System.out.println("Cerrando grupo...");
    }
}
