
package Modelo;


public class Controle {

    public String VerificarComp(String palavra){
        return verificar(palavra);
    }
    
    private static String verificar(java.lang.String palavra) {
        Modelo.Verificar_Service service = new Modelo.Verificar_Service();
        Modelo.Verificar port = service.getVerificarPort();
        return port.verificar(palavra);
    }

}
