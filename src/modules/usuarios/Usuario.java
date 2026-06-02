package modules.usuarios;

public class Usuario {
    private String nombre;
    private String correo;
    private String contraseña;
    private String rol;
    
    public Usuario(String nombre, String correo, String contraseña, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    private boolean iniciarSesion(String correo, String contraseña) {
        // Lógica para verificar el correo y la contraseña
        return this.correo.equals(correo) && this.contraseña.equals(contraseña);
    }

    private boolean cerrarSesion() {
        // Lógica para cerrar sesión
        return true; // Simulación de cierre de sesión exitoso
    }

    private boolean cambiarContraseña(String nuevaContraseña) {
        // Lógica para cambiar la contraseña
        this.contraseña = nuevaContraseña;
        return true; // Simulación de cambio de contraseña exitoso
    }
    
}
