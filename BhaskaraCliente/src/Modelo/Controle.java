
package Modelo;


public class Controle {

    public String Verifica(String a, String b , String c){
        return baskhara(a,b,c);
    }
    
    private static String baskhara(java.lang.String a, java.lang.String b, java.lang.String c) {
        Modelo.Baskhara_Service service = new Modelo.Baskhara_Service();
        Modelo.Baskhara port = service.getBaskharaPort();
        return port.baskhara(a, b, c);
    }

}
