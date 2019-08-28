
package paquete1;

import java.util.*;


public class ListaPersona {
     private ArrayList<Persona> lista;
     private Persona p;

    public ListaPersona() {
    lista= new ArrayList();
    
    }

    public ListaPersona(ArrayList<Persona> lista) {
        this.lista = lista;
    }
   
     public Boolean agregar(Persona p){
        if(p==null){
            return false;
        }
        
             return lista.add(p);
        
        
     }
    public Boolean remover(Persona p){
        if(p==null){
            return false;
        }
        return lista.remove(p);
        
    }
    public Boolean actualizar(Persona p){
        return null;
       
    }
    public Persona buscar(Persona p){
        if(p==null){
            return null;
        }
        if(!lista.contains(p)){
            return null;
        }
        else{
            int pos = lista.indexOf(p);
        return lista.get(pos);
        }
        
        }
    public String listas (){
        return null;
    }
    
    
    
}
