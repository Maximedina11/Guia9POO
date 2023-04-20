
package guia9pooej2;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

public class Guia9POOEj2 {

    public static void main(String[] args) {
        
        ParDeNumeros par = new ParDeNumeros();
        ParDeNumerosService servicio = new ParDeNumerosService();
        
        servicio.mostrarValores(par);
        System.out.println("El numero mayor es: " + servicio.devolverMayor(par));
        System.out.println("La potencia del numero mayor elevado al menor es: " + servicio.calcularPotencia(par));
        System.out.println("La raiz cuadrada del numero menor es: " + servicio.calculaRaiz(par));
        
    }
    
}
