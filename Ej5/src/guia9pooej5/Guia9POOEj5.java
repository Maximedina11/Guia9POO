/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9pooej5;

import Entidades.Persona;
import Servicio.PersonaService;

public class Guia9POOEj5 {

   
    public static void main(String[] args) {
        
        PersonaService servicio = new PersonaService();
        Persona persona = servicio.crearPersona();
        int edad = servicio.calcularEdad(persona);
        System.out.println("La edad de la persona es: " + edad);
        System.out.println("¿Es menor que 18 años? " + servicio.menorQue(persona, 18));
        servicio.mostrarPersona(persona);
    }
}
        
    
    

