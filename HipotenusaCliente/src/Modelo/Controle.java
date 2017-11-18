
package Modelo;


public class Controle {

    public String CalcularHipotenusa(String CA, String CO){
        return hipotenusa(CA,CO);
    }
    
    private static String hipotenusa(java.lang.String ca, java.lang.String co) {
        Modelo.Hipotenusa_Service service = new Modelo.Hipotenusa_Service();
        Modelo.Hipotenusa port = service.getHipotenusaPort();
        return port.hipotenusa(ca, co);
    }

}
