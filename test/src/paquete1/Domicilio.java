
package paquete1;

import java.io.Serializable;
import java.util.Objects;






public class Domicilio implements Serializable{
    String calleNum;
    String colonia;
    String  codigoPostal;
    String  ciudad;
    
    


        
    public Domicilio() {
    }

    public Domicilio(String calleNum, String colonia, String codigoPostal, String ciudad) {
        this.calleNum = calleNum;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    
    
    public String getCalleNum() {
        return calleNum;
    }

    public void setCalleNum(String calleNum) {
        this.calleNum = calleNum;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.calleNum);
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
        final Domicilio other = (Domicilio) obj;
        if (!Objects.equals(this.calleNum, other.calleNum)) {
            return false;
        }
        return true;
    }

   
    
    
    @Override
    public String toString() {
        return "Domicilio{" + "calleNum=" + calleNum + ", colonia=" + colonia + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + '}';
    }

    
}
