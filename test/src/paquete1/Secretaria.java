
package paquete1;

import java.util.Calendar;
import java.util.Date;


public class Secretaria  extends Empleado{
    private String grado;
    private String usuario;
    private String contrasenia;
   //constructores 

    public Secretaria(String grado, String usuario, String contrasenia, Integer rfc, double salario) {
        super(rfc, salario);
        this.grado = grado;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public Secretaria(String grado, String usuario, String contrasenia, Integer rfc, double salario, Integer numero, Calendar ingreso, String nombre, String apellido1, String apellido2, String genero, Estado estado1, String homoclave, Domicilio domicilio, Calendar  nacimiento) {
        super(rfc, salario, numero, ingreso, nombre, apellido1, apellido2, genero, estado1, homoclave, domicilio, nacimiento);
        this.grado = grado;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public Secretaria() {
        
        
        
        
    }

   

    
    

 



    

    
   
    

    

    
  //metodos Set y get
    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return super.toString()+"Secretaria{" + "grado=" + grado + ", usuario=" + usuario + ", contrasenia=" + contrasenia + '}';
    }

  

   
    

    
    
} 
