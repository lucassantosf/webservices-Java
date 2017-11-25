
package Controle;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ConvertWebService")
public class ConvertWebService {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "ToFarenheit")
    public String ToFarenheit(@WebParam(name = "C") String C){
        String mensagem = "";
        try{
            Double Cel = Double.parseDouble(C);
            double Fa = ( (1.8 * Cel) + 32);
            mensagem = String.valueOf(Fa);
        }catch(NumberFormatException e){
            mensagem = "Erro de Conversão";
        }        
        return mensagem;
    }
    
    @WebMethod(operationName = "ToCelsius")
    public String ToCelsius(@WebParam(name = "F") String F){
        String mensagem = "";
        try{
            Double Fa = Double.parseDouble(F);
            double C = ( (Fa - 32) / 1.8);
            mensagem = String.valueOf(C);
        }catch(NumberFormatException e){
            mensagem = "Erro de Conversão";
        }        
        return mensagem;
    }
    
    
}
