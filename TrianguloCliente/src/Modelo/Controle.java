
package Modelo;


public class Controle {
    
    public Controle(){
    
    }
    
    public String Verifica(String n1, String n2, String n3){
        return triangulo(n1, n2, n3);
    }

    private static String triangulo(java.lang.String lado1, java.lang.String lado2, java.lang.String lado3) {
        controle.TrainguloService_Service service = new controle.TrainguloService_Service();
        controle.TrainguloService port = service.getTrainguloServicePort();
        return port.triangulo(lado1, lado2, lado3);
    }
    
      

}
