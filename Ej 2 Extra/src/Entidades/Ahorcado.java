
package Entidades;

import java.util.Scanner;

public class Ahorcado {
    
     private char[] palabra;
    private int letrasEncontradas;
    private int jugadasMaximas;
    private int oportunidadesRestantes;

    public Ahorcado(String palabra, int oportunidadesMaximas) {
        this.palabra = palabra.toCharArray();
        this.letrasEncontradas = 0;
        this.jugadasMaximas = oportunidadesMaximas;
        this.oportunidadesRestantes = oportunidadesMaximas;
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + palabra.length);
    }

    public boolean buscar(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                encontrada = true;
                letrasEncontradas++;
            }
        }
        if (!encontrada) {
            oportunidadesRestantes--;
        }
        return encontrada;
    }

    public void encontradas(char letra) {
        int encontradas = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                encontradas++;
            }
        }
        System.out.println("Número de letras (encontradas, faltantes): (" + encontradas + "," + (palabra.length - encontradas) + ")");
    }

    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + oportunidadesRestantes);
    }

    public void juego() {
        Scanner leer = new Scanner(System.in);
        while (oportunidadesRestantes > 0 && letrasEncontradas < palabra.length) {
            System.out.print("Ingrese una letra: ");
            char letra = leer.next().charAt(0);
            if (buscar(letra)) {
                System.out.println("Mensaje: La letra pertenece a la palabra");
            } else {
                System.out.println("Mensaje: La letra no pertenece a la palabra");
            }
            encontradas(letra);
            intentos();
        }
        if (letrasEncontradas == palabra.length) {
            System.out.println("¡Felicidades! Has encontrado la palabra.");
        } else {
            System.out.println("Lo siento, te has quedado sin oportunidades.");
        }
    }

    
}
