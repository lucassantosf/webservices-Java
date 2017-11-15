
package Controle;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "TrainguloService")
public class TrainguloService {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "Triangulo")
    public String Triangulo(@WebParam(name = "lado1") String l1, @WebParam(name = "lado2") String l2, @WebParam(name = "lado3") String l3){
        Controle.VerificaTriangulo VT = new Controle.VerificaTriangulo();
        return VT.Verificar(l1, l2, l3);
    }
}
