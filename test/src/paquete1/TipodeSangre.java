
package paquete1;

import java.io.Serializable;




public enum TipodeSangre implements Serializable {
O_POSITIVO("O POSITIVO","O+"),
A_NEGATIVO("A NEGATIVO","A-"),
A_POSITIVO("A POSITIVO","A+"),
B_NEGATIVO("B NEGATIVO","B-"),        
B_POSITIVO("B POSITIVO","B+"),
AB_NEGATIVO("AB NEGATIVO","AB-"),
AB_POSITIVO("AB POSITIVO","AB+");
   
private final String palabras;
private final String abreviatura;

    private TipodeSangre(String palabras, String abreviatura) {
        this.palabras = palabras;
        this.abreviatura = abreviatura;
    }

    public String getPalabras() {
        return palabras;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

 


}
