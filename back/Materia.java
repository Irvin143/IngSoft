package back;

public class Materia {
    private int    idMateria;
    private String clave;
    private String nombre;
    private int    creditos;
    private int calificacion;

    public Materia(int idMateria, String clave, String nombre, int creditos, int calificacion) {
        this.idMateria = idMateria;
        this.clave     = clave;
        this.nombre    = nombre;
        this.creditos  = creditos;
        this.calificacion = calificacion;
    }

    public int getIdMateria() { 
        return idMateria;  
    }

    public String getClave() {
            return clave;      
    }

    public String getNombre() { 
        return nombre;    
    }

    public int getCreditos() { 
        return creditos;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setIdMateria(int idMateria) {
         this.idMateria = idMateria;
    }
    public void setClave(String clave) {
         this.clave     = clave;
    }

    public void setNombre(String nombre) {
         this.nombre    = nombre;
    }

    public void setCreditos(int creditos) { 
        this.creditos  = creditos;
    }
    public void setCalificacion(int calificacion) {
         this.calificacion = calificacion;
    }

    public void consultarGrupos() {
        System.out.println(" GRUPOS DE LA MATERIA: " + this.nombre);
        System.out.println("  Clave: " + this.clave);
        System.out.println("  Creditos: " + this.creditos);
        System.out.println("  Calificación: " + this.calificacion);
        System.out.println("\n  Los grupos se consultan desde el sistema de inscripción");
    }
}
