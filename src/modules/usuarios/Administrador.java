package modules.usuarios;

import java.util.List;
import back.Carrera;
import back.PlanEstudios;

public class Administrador extends Usuario {
    private int numeroEmpleado;


    private List<Usuario> usuarios;
    private List<Carrera> carreras;
    private List<PlanEstudios> planesEstudio;

    public Administrador(String nombre, String correo, String contraseña, int numeroEmpleado) {
        super(nombre, correo, contraseña, "Administrador");
        this.numeroEmpleado = numeroEmpleado;
    }

    public void asignarRoles(Usuario usuario, String nuevoRol) {
        if (usuario == null || nuevoRol == null || nuevoRol.isBlank()) {
            return;
        }
        usuario.setRol(nuevoRol);
    }
    
    public void gestionarUsuarios() {
        if (usuarios == null || usuarios.isEmpty()) {
            return;
        }

        for (Usuario usuario : usuarios) {
            asignarRoles(usuario, "Usuario");
        }
    }

    public void gestionarCarreras() {
        if (carreras == null || carreras.isEmpty()) {
            return;
        }

        for (Carrera carrera : carreras) {
            if (carrera != null) {
                carrera.toString();
            }
        }
    }

    public void gestionarPlanes(){
        if (planesEstudio == null || planesEstudio.isEmpty()) {
            return;
        }

        for (PlanEstudios plan : planesEstudio) {
            if (plan != null) {
                plan.toString();
            }
        }
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
}
