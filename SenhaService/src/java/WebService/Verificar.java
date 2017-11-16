
package WebService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "Verificar")
public class Verificar {

    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "Verificar")
    public String VerificarTamanho(@WebParam(name = "palavra") String size){
        double tamanho = size.length();
        return String.valueOf(tamanho);        
    }
}
