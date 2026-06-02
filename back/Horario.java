package back;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Horario {

    private int idHorario;
    private String dia;
    private LocalTime horaInicio; 
    private LocalTime horaFin;

    private List<Grupo> grupos;

    public Horario(int idHorario, String dia, LocalTime horaInicio, LocalTime horaFin) {
        this.idHorario  = idHorario;
        this.dia        = dia;
        this.horaInicio = horaInicio;
        this.horaFin    = horaFin;
        this.grupos     = new ArrayList<>();
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public boolean validarCruce(Horario otro) {
        if (otro == null) {
            return false;
        }
        
        if (!this.dia.equalsIgnoreCase(otro.dia)) {
            return false;
        }
        
        boolean cruceHoras = this.horaInicio.isBefore(otro.horaFin) && this.horaFin.isAfter(otro.horaInicio);
        
        return cruceHoras;
    }
}
