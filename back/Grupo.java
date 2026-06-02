package back;

public class Grupo {

    private int    idGrupo;
    private int    cupoMaximo;
    private int    cupoDisponible;
    private String estado;

    private Aula aula;
    private Horario horario;
    private Docente docente;
    private PlanEstudios planEstudios;
    private Materia materia;

    public Grupo(int idGrupo, int cupoMaximo, int cupoDisponible, String estado) {
        this.idGrupo        = idGrupo;
        this.cupoMaximo     = cupoMaximo;
        this.cupoDisponible = cupoDisponible;
        this.estado         = estado;
        this.aula           = null;
        this.horario        = null;
        this.docente        = null;
        this.planEstudios   = null;
        this.materia        = null;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public int getCupoDisponible() {
        return cupoDisponible;
    }

    public void setCupoDisponible(int cupoDisponible) {
        this.cupoDisponible = cupoDisponible;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public PlanEstudios getPlanEstudios() {
        return planEstudios;
    }

    public void setPlanEstudios(PlanEstudios planEstudios) {
        this.planEstudios = planEstudios;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void abrirGrupo() {
        if (this.aula == null) {
            throw new IllegalStateException("No se puede abrir el grupo: no tiene aula asignada");
        }
        if (this.docente == null) {
            throw new IllegalStateException("No se puede abrir el grupo: no tiene docente asignado");
        }
        if (this.horario == null) {
            throw new IllegalStateException("No se puede abrir el grupo: no tiene horario asignado");
        }
        this.estado = "ABIERTO";
        System.out.println(" Grupo " + this.idGrupo + " abierto para inscripciones.");
    }

    public void cerrarGrupo() {
        if (!this.estado.equals("ABIERTO")) {
            throw new IllegalStateException(
                "El grupo " + this.idGrupo + " no está abierto ya que su estado actual: " + this.estado 
            );
        }
        this.estado = "CERRADO";
        System.out.println(" Grupo " + this.idGrupo + " cerrado. Inscripciones finalizadas.");
    }

    public boolean validarCupo() {
        return this.cupoDisponible > 0 && this.estado.equals("ABIERTO");
    }
}
