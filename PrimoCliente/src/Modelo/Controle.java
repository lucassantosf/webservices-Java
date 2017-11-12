
package Modelo;


public class Controle {

    public String VerificaPrimo(String numero){
        return primo(numero);
    }
    
    private static String primo(java.lang.String primo) {
        service.PrimoService_Service service = new service.PrimoService_Service();
        service.PrimoService port = service.getPrimoServicePort();
        return port.primo(primo);
    }
}
