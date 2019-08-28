package paquete1;

import java.awt.Event.*;
import java.util.Objects;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public  abstract class Persona  extends JFrame implements Serializable{
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String genero;
    protected Estado estado1;
    protected String homoclave;
    protected String curpg;
    protected Domicilio domicilio;
    protected Calendar nacimiento;
    protected Integer edad;
    protected String Estado2;

   

    public void setCurpg(String curpg) {
        this.curpg = curpg;
    }

    
    
//constructores


    public Persona(String nombre, String apellido1, String apellido2, String genero, Calendar nacimiento) {
        
        this.nombre = nombre;
        this.apellido1= apellido1;
        this.apellido2 = apellido2;
        this.genero = genero;
        this.nacimiento = nacimiento;
    
    }


    public Persona() {
        
    }

    public Persona(String nombre, String apellido1, String apellido2, String genero, Estado estado1, String homoclave, Domicilio domicilio, Calendar nacimiento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.genero = genero;
        this.estado1 = estado1;
        this.homoclave = homoclave;
        this.domicilio = domicilio;
        this.nacimiento = nacimiento;
    }

    
   
    
    
	
	//metodos set y funciones get de acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Estado getEstado() {
        return estado1;
    }

    public void setEstado(Estado estado) {
        this.estado1 = estado;
    }

    public String getHomoclave() {
        return homoclave;
    }

    public void setHomoclave(String homoclave) {
        this.homoclave = homoclave;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Calendar getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Calendar nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.curpg);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.curpg, other.curpg)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" +curpg+ "\nnombre=" + nombre+ "\n apellido1=" + apellido1 + "\n apellido2=" + apellido2 + "\n genero=" + genero + "\n estado1=" + estado1 + "\n homoclave=" + homoclave + "\n domicilio=" + domicilio +"\nCURP=" +curpg+ "\n nacimiento=" + nacimiento + '}';
    }

    
    public   void curp(String apellido1,String apellido2 ,String nombre, String genero ,String estado){
       
        
        char a = 0,b = 0;
        
        char c1 = apellido1.toUpperCase().charAt(0); // el primer caracter del apellido
        char c2 = 0;
        for (int i = 1; i < apellido1.toUpperCase().length(); i++) {
            char l = apellido1.toUpperCase().charAt(i);
            if(l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U'){
                c2 = l;
                break;
            }
        }
        char c3 =apellido2.toUpperCase().charAt(0);
        char c4 = nombre.toUpperCase().charAt(0);
        int anio= nacimiento.get(Calendar.YEAR);
        String year = String.valueOf(anio);
        
        char c5 = year.charAt(2);
        char c6 = year.charAt(3);
        int mes= nacimiento.get(Calendar.MONTH);
        String month = String.valueOf(mes);
        char c7 = 0;
        char c8 = 0;
        
        if(mes < 10){
            c7 = '0';
            c8 = month.charAt(0);
        }
        else{
            c7 = month.charAt(0);
            c8 = month.charAt(1);
        }
        
        
        int dia= nacimiento.get(Calendar.DAY_OF_MONTH);
        String day = String.valueOf(nacimiento.get(Calendar.DAY_OF_MONTH));
        char c9 = 0;
        char c10 = 0;
                
        if(dia < 10){
            c9 = '0';
            c10 = day.charAt(0);
        }else{
            c9 = day.charAt(0);
            c10 = day.charAt(1);
        }
        
        char c11 = genero.toUpperCase().charAt(0);
        
        
        char c12 = a;
        char c13 = b;
        
        char c14 = 0;
        
        for (int i = 1; i < apellido1.length(); i++) {
            char l = apellido1.toUpperCase().charAt(i);
            if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){ // excluimos a las vocales
                c14 = l;
                break;
            }
        }
        
        char c15 = 0;
        
        for (int i = 1; i < apellido2.length(); i++) {
            char l = apellido2.toUpperCase().charAt(i);
            if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){ // excluimos a las vocales
                c15 = l;
                break;
            }
        }
        
        char c16 = 0;
        
        for (int i = 1; i < nombre.toUpperCase().length(); i++) {
            char l = nombre.toUpperCase().charAt(i);
            if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){ // excluimos a las vocales
                c16 = l;
                break;
            }
        }
      
        
        int numero = (int) (Math.random()*9+1);
        String n = String.valueOf(numero);
        char c17 = n.charAt(0);
        
        numero = (int) (Math.random()*9+1);
        String bd = String.valueOf(numero);
        
        char c18 = bd.charAt(0);
        
        
        curpg = String.valueOf(c1+""+c2+""+c3+""+c4+""+c5+""+c6+""+c7+""+c8+""+c9+""+c10+""+""+c11+""+letras(estado)+""+c14+""+c15+""+c16+""+c17+""+c18);
        JOptionPane.showMessageDialog(null, curpg);
      
        
    }
 public String letras(String es){
        
        
        Estado[] est =Estado.values();
        
        String let = "";

            for (int i = 0; i<est.length; i++){
                
                Estado e = est[i];

                if(e.getEstados().equalsIgnoreCase(es)){                
                    
                    let=  e.getLetras();
                }
                
                
}
       
            return let;
    }
public  void CalcularEdad(){
  
    Calendar fechaActual= GregorianCalendar.getInstance();
    int anioactual=fechaActual.get(Calendar.YEAR);
    int mesactual=fechaActual.get(Calendar.MONTH);
    int diaactual=fechaActual.get(Calendar.DAY_OF_MONTH);
    
    int dia=nacimiento.get(Calendar.DAY_OF_MONTH);
    int mes=nacimiento.get(Calendar.MONTH);
    int anio=nacimiento.get(Calendar.YEAR);
   
    
  
    
    if(anio<=anioactual){
        if(mes<=mesactual){
            if(dia<=diaactual) {
                edad=anioactual-anio;
                JOptionPane.showMessageDialog(null,"La edad es pp : "+edad);
            }
            else{
                edad= (anioactual -(anio))-1;
            JOptionPane.showMessageDialog(null,"la edad es tt : "+edad);
            }
            
        }
    }
  
    
}

   }

