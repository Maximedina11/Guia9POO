/*Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
-Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
-Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
-Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
-Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
-Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.
-Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena 
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
-Método reemplazar(String letra), deberá reemplazar todas las letras “a” 
que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
-Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario 
y devuelve verdadero si la contiene y falso si no.
*/


package servicios;

import entidades.Cadena;

public class CadenaServicio {

    public void mostrarVocales(Cadena cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            char letra = cadena.getFrase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        System.out.println("La frase ingresada tiene " + contador + " vocales.");
    }

    public void invertirFrase(Cadena cadena) {
        StringBuilder builder = new StringBuilder(cadena.getFrase());
        System.out.println(builder.reverse().toString());
    }

    public void vecesRepetido(Cadena cadena, String letra) {
        int contador = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            if (cadena.getFrase().charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");
    }

    public void compararLongitud(Cadena cadena1, String frase2) {
        if (cadena1.getLongitud() > frase2.length()) {
            System.out.println("La primera frase es más larga que la segunda.");
        } else if (cadena1.getLongitud() < frase2.length()) {
            System.out.println("La segunda frase es más larga que la primera.");
        } else {
            System.out.println("Las frases tienen la misma longitud.");
        }
    }

    public void unirFrases(Cadena cadena1, String frase2) {
        System.out.println(cadena1.getFrase() + " " + frase2);
    }

    public void reemplazar(Cadena cadena, String letraOriginal, String letraNueva) {
        System.out.println(cadena.getFrase().replace(letraOriginal.charAt(0), letraNueva.charAt(0)));
    }

    public boolean contiene(Cadena cadena, String letra) {
        return cadena.getFrase().contains(letra);
    }
}
    
    

