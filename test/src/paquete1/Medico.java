
package paquete1;

import java.util.Calendar;
import java.util.Date;


public class Medico extends Empleado{
    private String titulo;
    private String especialidad;
    private String usuario;
    private String contrasenia;

    public Medico() {
    }
    
    

    //constructores
    public Medico(Integer rfc, double salario) {
        super(rfc, salario);
    }

    public Medico(String titulo, String especialidad, String usuario, String contrasenia, Integer rfc, double salario, Integer numero, Calendar  ingreso, String nombre, String apellido1, String apellido2, String genero, Estado estado1, String homoclave, Domicilio domicilio, Calendar  nacimiento) {
        super(rfc, salario, numero, ingreso, nombre, apellido1, apellido2, genero, estado1, homoclave, domicilio, nacimiento);
        this.titulo = titulo;
        this.especialidad = especialidad;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public Medico(String titulo, String especialidad) {
        
        this.titulo = titulo;
        this.especialidad = especialidad;
    }

   
   
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
        return super.toString()+"Medico{" + "titulo=" + titulo + "\n especialidad=" + especialidad + "\n usuario=" + usuario + "\n contrasenia=" + contrasenia + '}';
    }

    
    
    
    
    
    
            }
