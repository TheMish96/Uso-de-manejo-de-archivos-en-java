
package paquete1;

import java.io.Serializable;
import java.util.*;
import java.util.Objects;
import javax.swing.JFrame;


public   class Consulta extends JFrame implements Serializable {
    private TipodeSangre tipodeSangre;
    Integer id;
    Calendar fecha;
    Medico medico;
    Paciente paciente;
    String sintomas;
    String disgnostico;
    String receta;

    public Consulta() {
    }

    public Consulta(TipodeSangre tipodeSangre) {
        this.tipodeSangre = tipodeSangre;
    }

    public TipodeSangre getTipodeSangre() {
        return tipodeSangre;
    }

    public void setTipodeSangre(TipodeSangre tipodeSangre) {
        this.tipodeSangre = tipodeSangre;
    }
    
    public Consulta(Integer id, Calendar fecha, Medico medico, Paciente paciente, String sintomas, String disgnostico, String receta) {
        this.id = id;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
        this.sintomas = sintomas;
        this.disgnostico = disgnostico;
        this.receta = receta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDisgnostico() {
        return disgnostico;
    }

    public void setDisgnostico(String disgnostico) {
        this.disgnostico = disgnostico;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Consulta other = (Consulta) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Consulta{" + "id=" + id + ", fecha=" + fecha + ", medico=" + medico + ", paciente=" + paciente + ", sintomas=" + sintomas + ", disgnostico=" + disgnostico + ", receta=" + receta + '}';
    }

    
}
