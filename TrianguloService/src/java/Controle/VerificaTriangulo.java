
package Controle;


public class VerificaTriangulo {

    private int lado1;
    private int lado2;
    private int lado3;
    
    public String Verificar(String l1, String l2, String l3){
    
        String mensagem = "";
         
        try{
            
            lado1 = Integer.parseInt(l1);
            lado2 = Integer.parseInt(l2);
            lado3 = Integer.parseInt(l3);     
            
            if((lado1 == lado2) && (lado2 == lado3) ){
                mensagem = "Triângulo Equilatero";
            }else if( (lado1 == lado3) || (lado1 == lado2)){
                mensagem = "Triângulo Isósceles";
            }else{
                mensagem = "Triângulo Escaleno";
            }            
        
        }catch(NumberFormatException e){
            
            mensagem = "Erro de Conversão";        
        }
        
        return mensagem;
    }    
    
}
