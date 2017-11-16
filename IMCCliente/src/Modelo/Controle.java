
package Modelo;


public class Controle {

    public String VerificarImc(String altura, String peso){
        
        return imc(altura, peso);
    
    }
    
    
    private static String imc(java.lang.String altura, java.lang.String peso) {
        Modelo.IMCService_Service service = new Modelo.IMCService_Service();
        Modelo.IMCService port = service.getIMCServicePort();
        return port.imc(altura, peso);
    }

}
