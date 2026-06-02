package modules.usuarios;

public class Alumno extends Usuario {
    private String matricula;
    private String estatus;
    
    public Alumno(String nombre, String correo, String contraseña, String matricula,String estatus) {
        super(nombre, correo, contraseña, "Alumno");
        this.matricula = matricula;
        this.estatus = estatus;
    }

    public void consultarKardex() {
        // Lógica para mostrar las calificaciones del alumno
        System.out.println("Mostrando calificaciones del alumno...");
    }

    private void realizarCarga() {
        // Lógica para que el alumno realice la carga de materias
        System.out.println("Realizando carga de materias...");
    }
}
