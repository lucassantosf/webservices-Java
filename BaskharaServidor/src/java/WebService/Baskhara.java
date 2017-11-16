
package WebService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "Baskhara")
public class Baskhara {
    
    private Double a,b,c,delta, x1, x2;

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "Baskhara")
    public String Baskhara(@WebParam(name="a") String a, @WebParam(name="b") String b, @WebParam(name="c") String c){
        String mensagem = "";
        try{
            this.a = Double.parseDouble(a);
            this.b = Double.parseDouble(b);
            this.c = Double.parseDouble(c);
            
            this.delta = (( this.b * this.b ) - (4  * this.a * this.c));
            
            if(this.delta > 0){
                this.x1 =  (-this.b + Math.sqrt(delta)) / 2 * this.a;
                this.x2 =  (-this.b - Math.sqrt(delta)) / 2 * this.a;
                mensagem += " X 1 = " + String.valueOf(x1) + " X 2 ="+ String.valueOf(x2);
                
            }else if (this.delta == 0){
                this.x1 =  (-this.b + Math.sqrt(delta)) / 2 * this.a;
                this.x2 = this.x1;
                mensagem += " Só X1" + String.valueOf(this.x1);
                
            }else{
                mensagem = "Delta Negativo";
            }
        
        }catch(NumberFormatException e ){
            mensagem = "Erro de Conversão";
        }     
        
        return mensagem;
    }
}
