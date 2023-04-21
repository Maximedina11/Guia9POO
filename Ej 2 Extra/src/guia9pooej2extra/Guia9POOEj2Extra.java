
package guia9pooej2extra;

import Entidades.Ahorcado;
import Servicios.AhorcadoService;


public class Guia9POOEj2Extra {

    public static void main(String[] args) {
         Ahorcado ahorcado = AhorcadoService.crearJuego();
    ahorcado.longitud();
    ahorcado.juego();
    }
    
}
