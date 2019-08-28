
package paquete1;

import java.util.*;
import javax.swing.JOptionPane;



public abstract class Empleado extends Persona{
  protected Integer rfc;
  protected double salario;
 protected Integer numero;
  protected Integer antiguedad;
  protected Calendar ingreso;

    // Constrcutores  
  public Empleado(Integer rfc, double salario) {
        this.rfc = rfc;
        this.salario = salario;
    }

    public Empleado(Integer rfc, double salario, Integer numero, Calendar ingreso, String nombre, String apellido1, String apellido2, String genero, Estado estado1, String homoclave, Domicilio domicilio, Calendar nacimiento) {
        super(nombre, apellido1, apellido2, genero, estado1, homoclave, domicilio, nacimiento);
        this.rfc = rfc;
        this.salario = salario;
        this.numero = numero;
        this.ingreso = ingreso;
    }

    

    public Empleado(Integer rfc) {
        this.rfc = rfc;
    }

    public Empleado() {
    }

   
   
   // Metodos get y set

    public Integer getRfc() {
        return rfc;
    }

    public void setRfc(Integer rfc) {
        this.rfc = rfc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }
    //metodos hascode  y equals
   
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Calendar getIngreso() {
        return ingreso;
    }

    /*  @Override
    public int hashCode() {
    int hash = 3;
    hash = 67 * hash + Objects.hashCode(this.rfc);
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
    final Empleado other = (Empleado) obj;
    if (!Objects.equals(this.rfc, other.rfc)) {
    return false;
    }
    return true;
    }
     */
    public void setIngreso(Calendar ingreso) {
        this.ingreso = ingreso;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "rfc=" + rfc + "\n salario=" + salario + "\n numero=" + numero + "\n ingreso=" + ingreso + '}';
    }

    

    
    
   
    public  void calcularAntiguedad (){
        Calendar  fechaActual= GregorianCalendar.getInstance();
    int anioactual=fechaActual.get(Calendar.YEAR);
    int mesactual=fechaActual.get(Calendar.MONTH);
    int diaactual=fechaActual.get(Calendar.DAY_OF_MONTH);
    
    int dia=ingreso.get(Calendar.DAY_OF_MONTH);
    int mes=ingreso.get(Calendar.MONTH);
    int anio= ingreso.get(Calendar.YEAR);
   
  
   
    if(anio<=anioactual){
        if(mes<=mesactual){
            if(dia<=diaactual) {
                antiguedad=anioactual-anio;
                JOptionPane.showMessageDialog(null,"La antiguedad es : "+antiguedad);
            }
            else{ antiguedad= (anioactual -(anio))-1;
            JOptionPane.showMessageDialog(null,"la antiguedad: "+antiguedad);}
        }
        
    }
    }
   
}

