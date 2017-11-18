
package Modelo;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Hipotenusa")
public class Hipotenusa {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "Hipotenusa")
    public String Hipotenusa(@WebParam(name = "CA") String CA, @WebParam(name= "CO") String CO){
        String mensagem = "";
        try{
            double catA = Double.parseDouble(CA);
            double catO = Double.parseDouble(CO);
            double resultado = Math.sqrt((Math.pow(catA, 2)) + (Math.pow(catO, 2)));
            mensagem = String.valueOf(resultado);
        }catch(NumberFormatException e){
            mensagem = "Erro de Conversão";
        }
        return mensagem;        
    }
}
