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
        return this.correo.equals(correo) && this.contraseña.equals(contraseña);
    }

    private boolean cerrarSesion() {        
        return true; // Simulación de cierre de sesión exitoso
    }

    private boolean cambiarContraseña(String nuevaContraseña) {
        if (nuevaContraseña == null || nuevaContraseña.length() < 6) {
            System.out.println("Error: la contraseña debe tener al menos 6 caracteres.");
            return false;
        }
        if (nuevaContraseña.equals(this.contraseña)) {
            System.out.println("Error: la nueva contraseña no puede ser igual a la actual.");
            return false;
        }
        this.contraseña = nuevaContraseña;
        return true; // Simulación de cambio de contraseña exitoso
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
