
package Service;


public class VerificaPrimo {
    
    public String Verificar(String num){
        
        String mensagem = "É primo";
        
        try{
            int numero = Integer.parseInt(num);
            for(int i = 2; i < numero; i++ ){
                if( numero % i == 0){
                    mensagem = "Não é primo";
                    break;
                }
            }        
        }catch(NumberFormatException e){
            mensagem = "Erro de conversão";
        }
        return mensagem;    
    }

}
