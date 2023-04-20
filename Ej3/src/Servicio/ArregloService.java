/*
 Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
-Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
-Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
-Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
-Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
 Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
*/
 
package Servicio;

import java.util.Arrays;
import java.util.Random;

public class ArregloService {
    
 public void inicializarA(double[] arr) {
    Random rand = new Random();
    for (int i = 0; i < arr.length; i++) {
        arr[i] = rand.nextDouble();
    }
}
 
public void mostrar(double[] arr) {
    System.out.println(Arrays.toString(arr));
}

public void ordenar(double[] arr) {
    Arrays.sort(arr);
    for (int i = 0; i < arr.length / 2; i++) {
        double temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
    }
}

public void inicializarB(double[] A, double[] B) {
    System.arraycopy(A, 0, B, 0, 10);
    Arrays.fill(B, 10, B.length, 0.5);
}
}