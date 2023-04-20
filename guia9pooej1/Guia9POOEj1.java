
package guia9pooej1;

import entidades.Cadena;
import servicios.CadenaServicio;

public class Guia9POOEj1 {

    public static void main(String[] args) {
        Cadena cadena = new Cadena("casa blanca");
        CadenaServicio servicio = new CadenaServicio();

        servicio.mostrarVocales(cadena);
        servicio.invertirFrase(cadena);
        servicio.vecesRepetido(cadena, "a");
        servicio.compararLongitud(cadena, "casa");
        servicio.unirFrases(cadena, "casa negra");
        servicio.reemplazar(cadena, "a", "o");
        System.out.println(servicio.contiene(cadena, "b"));
    }
}
