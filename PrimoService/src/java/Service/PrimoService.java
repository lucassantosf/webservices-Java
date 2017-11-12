
package Service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "PrimoService")
public class PrimoService {

    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "primo")
    public String Primo(@WebParam(name = "primo") String numero){
        Service.VerificaPrimo vp = new Service.VerificaPrimo();
        return vp.Verificar(numero);    
    }
    
}
