/*
 Crear en el Main dos arreglos. El arreglo A de 50 números reales 
 y el arreglo B de 20 números reales.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 */
package guia9pooej3;

import Servicio.ArregloService;

public class Guia9POOEj3 {

    public static void main(String[] args) {
       
        double[] A = new double[50];
        double[] B = new double[20];

        ArregloService servicio = new ArregloService();

        servicio.inicializarA(A);
        System.out.println("Arreglo A:");
        servicio.mostrar(A);
        servicio.ordenar(A);
        System.out.println("Arreglo A ordenado:");
        servicio.mostrar(A);
        servicio.inicializarB(A, B);
        System.out.println("Arreglo B:");
        servicio.mostrar(B);
    }
}
