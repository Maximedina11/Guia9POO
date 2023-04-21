
package servicios;

import entidades.MesSecreto;
import java.util.Scanner;


public class MesServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public MesSecreto asignarMesSecreto(String[] meses){
        MesSecreto nuevoMesSecreto = new MesSecreto();
        
        nuevoMesSecreto.setMesSecreto(meses[(int)Math.floor(Math.random() * 12 + 1)]);
        
        return nuevoMesSecreto;
    }
    
//     * El programa debe pedir al usuario que
//     * adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no
//     * lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un ejemplo
//     * de ejecución del programa podría ser este: Adivine el mes secreto.
//     * Introduzca el nombre del mes en minúsculas: febrero No ha acertado.
//     * Intente adivinarlo introduciendo otro mes: agosto ¡Ha acertado!
    
        public void adivinarMes(MesSecreto mesSecreto){
            
            System.out.println("Adivine el mes secreto");
            String mes = leer.nextLine();
            
            while (!mes.equalsIgnoreCase(mesSecreto.getMesSecreto())) {
                System.out.println("No ha acertado, intente adivinarlo introduciendo otro mes");
                mes = leer.nextLine();
            }
            
            System.out.println("¡Ha acertado!");
        }
    
}
