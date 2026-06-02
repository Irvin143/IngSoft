package back;

public class Materia {
    private int    idMateria;
    private String clave;
    private String nombre;
    private int    creditos;
    private String seriacion;

    public Materia(int idMateria, String clave, String nombre, int creditos, String seriacion) {
        this.idMateria = idMateria;
        this.clave     = clave;
        this.nombre    = nombre;
        this.creditos  = creditos;
        this.seriacion = seriacion;
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

    public String getSeriacion() { 
        return seriacion;  
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
    public void setSeriacion(String seriacion) {
         this.seriacion = seriacion;
    }

    public void consultarGrupos() {
        System.out.println(" GRUPOS DE LA MATERIA: " + this.nombre);
        System.out.println("  Clave: " + this.clave);
        System.out.println("  Creditos: " + this.creditos);
        System.out.println("  Seriación: " + (this.seriacion != null && !this.seriacion.isEmpty() ? this.seriacion : "Ninguna"));
        System.out.println("\n  Los grupos se consultan desde el sistema de inscripción");
    }
}
