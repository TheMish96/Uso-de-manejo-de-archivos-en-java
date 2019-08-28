
package paquete1;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Paciente  extends Persona{

private String  NSS;
private TipodeSangre tipodeSangre;
private float peso;
private float estatura;


    public Paciente() {
    }

 //comnstructores
    
    public Paciente(String NSS) {
        this.NSS = NSS;
    }

    public Paciente(String NSS, TipodeSangre tipodeSangre, float peso, float estatura, String nombre, String apellido1, String apellido2, String genero,Estado estado1, String homoclave, Domicilio domicilio, Calendar  nacimiento) {
        super(nombre, apellido1, apellido2, genero, estado1, homoclave, domicilio, nacimiento);
        this.NSS = NSS;
        this.tipodeSangre = tipodeSangre;
        this.peso = peso;
        this.estatura = estatura;
    }

    
   

    

   
   
    
 //Metodos Getters and setters
public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public TipodeSangre getTipodeSangre() {
        return tipodeSangre;
    }

    public void setTipodeSangre(TipodeSangre tipodeSangre) {
        this.tipodeSangre = tipodeSangre;
    }

   

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
   

    

    @Override
    public String toString() {
        return super.toString()+"Paciente{" + "\nNSS=" + NSS + "\n tipodeSangre=" + tipodeSangre + "\n peso=" + peso + "\n estatura=" + estatura + '}';
    }

   
    
    

}
