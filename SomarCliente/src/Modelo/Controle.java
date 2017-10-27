
package Modelo;


public class Controle {

    private String resultado;
    private String numero1;
    private String numero2;
    
    public Controle(String numero1, String numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = somar(numero1, numero2);
    }

    public String getResultado() {
        return resultado;
    }
    private static String somar(java.lang.String numero1, java.lang.String numero2) {
        Modelo.Somar_Service service = new Modelo.Somar_Service();
        Modelo.Somar port = service.getSomarPort();
        return port.somar(numero1, numero2);
    }

}
