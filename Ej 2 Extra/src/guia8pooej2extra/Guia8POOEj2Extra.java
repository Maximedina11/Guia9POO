
package guia8pooej2extra;

import Entidades.NIF;
import Servicios.NIFService;

public class Guia8POOEj2Extra {

    public static void main(String[] args) {
        
        NIFService nifService = new NIFService();
        NIF nif = new NIF();
        nifService.crearNIF(nif);
        nifService.mostrar(nif);
        
    }
    
}
