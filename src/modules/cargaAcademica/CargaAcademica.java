package modules.cargaAcademica;

public class CargaAcademica {
    private String fecha;
    private int totalCreditos;
    
    public CargaAcademica(String fecha, int totalCreditos) {
        this.fecha = fecha;
        this.totalCreditos = totalCreditos;
    }

    private void agregarMateria(String materia) {
        // Lógica para agregar una materia a la carga académica
        System.out.println("Agregando materia: " + materia);
    }

    private void eliminarMateria(String materia) {
        // Lógica para eliminar una materia de la carga académica
        System.out.println("Eliminando materia: " + materia);
    }

    private void validarCreditos() {
        // Lógica para validar que el total de créditos no exceda el límite permitido
        if (totalCreditos > 30) {
            System.out.println("Error: El total de créditos excede el límite permitido.");
        } else {
            System.out.println("Total de créditos válidos.");
        }
    }

    private void confirmarCarga() {
        // Lógica para confirmar la carga académica
        System.out.println("Carga académica confirmada para la fecha: " + fecha);
    }
}
