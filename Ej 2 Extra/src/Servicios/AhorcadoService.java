
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    
    public static Ahorcado crearJuego() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = leer.nextLine();
        System.out.print("Ingrese la cantidad de jugadas máximas: ");
        int jugadasMaximas = leer.nextInt();
        Ahorcado ahorcado = new Ahorcado(palabra, jugadasMaximas);
        return ahorcado;
    }
    
}
