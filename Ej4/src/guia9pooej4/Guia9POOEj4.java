
package guia9pooej4;

import Servicio.FechaService;
import java.util.Date;

public class Guia9POOEj4 {

    public static void main(String[] args) {
        
        FechaService servicio = new FechaService();
        Date fechaNacimiento = servicio.fechaNacimiento();
        Date fechaActual = servicio.fechaActual();
        int diferencia = servicio.diferencia(fechaNacimiento, fechaActual);
        System.out.println("La diferencia de años entre las dos fechas es: " + diferencia);
    }
}
        
    
    

