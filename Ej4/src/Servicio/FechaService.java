/*
 Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
-Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
-Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos 
el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
-El método debe retornar el objeto Date.
-Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años 
entre una y otra (edad del usuario).
 */

package Servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    
    private final Scanner scanner = new Scanner(System.in);

    public Date fechaNacimiento() {
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Día: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt() - 1;
        System.out.print("Año: ");
        int anio = scanner.nextInt() - 1900;
        return new Date(anio, mes, dia);
    }

    public Date fechaActual() {
        return new Date();
    }

    public int diferencia(Date fecha1, Date fecha2) {
        long diffInMillies = Math.abs(fecha2.getTime() - fecha1.getTime());
        long diff = diffInMillies / (24 * 60 * 60 * 1000);
        return (int) (diff / 365);
    }
}
    

