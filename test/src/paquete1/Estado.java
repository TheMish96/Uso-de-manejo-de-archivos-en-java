
package paquete1;

import java.io.Serializable;


public enum Estado implements Serializable{
    AGUASCALIENTES("AGUASCALIENTES", "AC"),
    BAJA_CALIFORNIA("BAJA CALIFORNIA", "BC"),  
    BAJA_CALIFORNIA_SUR("BAJA CALIFORNIA SUR", "BS"),
    CAMPECHE("CAMPECHE", "CC"),
    COAHUILA("COAHUILA", "CL"),
    COLIMA("COLIMA", "CM"),
    CHIAPAS("CHIAPAS","CS"),
    CHIHUAHUA("CHIHUAHUA", "CH"),
    DISTRITO_FEDERAL("DISTRITO FEDERAL", "DF"),
    DURANGO("DURANGO", "DG"),
    GUANAJUATO("GUANAJUATO", "GT"),
    GUERRERO("GUERRERO", "GR"),
    HIDALGO("HIDALGO", "HG"),
    JALISCO("JALISCO", "JC"),
    MEXICO("MEXICO", "EM"),
    MICHOACAN_DE_OCAMPO("MICHOACAN DE OCAMPO", "MO"),
    MORELOS("MORELOS", "MS"),
    NAYARIT("NAYARIT", "NT"),
    NUEVO_LEON("NUEVO LEON", "NL"),
    OAXACA("OAXACA", "OC"),
    PUEBLA("PUEBLA", "PL"),
    QUERETARO("QUERETARO", "QT"),
    QUINTANA_ROO("QUINTANA ROO", "QR"),
    SAN_LUIS_POTOSI("SAN LUIS POTOSI", "SP"),
    SINALOA("SINALOA", "SL"),
    SONORA("SONORA", "SR"),
    TABASCO("TABASCO", "TC"),
    TAMAULIPAS("TAMAULIPAS", "TS"),
    TLAXCALA("TLAXCALA", "TL"),
    VERACRUZ("VERACRUZ", "VZ"),
    YUCATAN("YUCATAN", "YN"),
    ZACATECAS("ZACATECAS", "ZS");
    
    private final String estados;
    private final String letras;

    private Estado(String estados, String letras) {
        this.estados = estados;
        this.letras = letras;
    }



    public String getEstados() {
        return estados;
    }

    public String getLetras() {
        return letras;
    }


    

    

   

}
