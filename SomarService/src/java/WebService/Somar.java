/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author petrucio
 */
@WebService(serviceName = "Somar")
public class Somar {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "somar")
    public String Somar(@WebParam(name="numero1")String n1, @WebParam(name="numero2")String n2){
        Double num1=0.0, num2=0.0, resultado=0.0;
        try{
            num1 = Double.parseDouble(n1);
            num2 = Double.parseDouble(n2);
            resultado = num1 + num2;
        }catch(NumberFormatException e ){
            return "erro";
        }
        return String.valueOf(resultado);
    
    }
}
