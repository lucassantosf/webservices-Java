package WebService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "IMCService")
public class IMCService {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "IMC")
    public String IMC(@WebParam(name = "altura") String altura, @WebParam(name = "peso") String peso){
    
        double imc = 0, h =0, p = 0;
        String mensagem = "";
        try{
            h = Double.parseDouble(altura);
            p = Double.parseDouble(peso);
            imc = (( p ) / (h * h));
            if( imc > 40 ){
                mensagem = "0besidade 3"+imc;
            }else if( imc > 35 && imc <=40 ){
                mensagem = "0besidade 2";
            }else if( imc > 30 && imc <=35 ){
                mensagem = "0besidade 1";
            }else if( imc > 25 && imc <=30 ){
                mensagem = "SobrePeso";
            }else if( imc > 18.6 && imc <=25 ){
                mensagem = "Peso Normal";
            }else{
                mensagem = "Abaixo";
            }
        
        }catch(NumberFormatException e){
            mensagem = "Erro de Conversão";
        }
        return mensagem;
    }
}
