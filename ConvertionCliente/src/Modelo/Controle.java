
package Modelo;


public class Controle {

    public String ToCelsius(String F){
        return toCelsius(F);
    }
    
    public String ToFahrenheit(String C){
        return toFarenheit(C);
    }
    
    private static String toCelsius(java.lang.String f) {
        Modelo.ConvertWebService_Service service = new Modelo.ConvertWebService_Service();
        Modelo.ConvertWebService port = service.getConvertWebServicePort();
        return port.toCelsius(f);
    }

    private static String toFarenheit(java.lang.String c) {
        Modelo.ConvertWebService_Service service = new Modelo.ConvertWebService_Service();
        Modelo.ConvertWebService port = service.getConvertWebServicePort();
        return port.toFarenheit(c);
    }
}
