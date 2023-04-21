
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class NIFService {
    
    Scanner leer = new Scanner(System.in);
    
    public void crearNIF(NIF nif) {
        System.out.println("Ingrese el DNI: ");
        long dni = leer.nextLong();
        nif.setDni(dni);
        nif.setLetra(calcularLetra(dni));
    }
    
    private char calcularLetra(long dni) {
        int resto = (int) (dni % 23);
        return NIF.LETRAS_DNI[resto];
    }
    
    
    public void mostrar(NIF nif) {
        System.out.println(nif.mostrar());
    }
    
}
