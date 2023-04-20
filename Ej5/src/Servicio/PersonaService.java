/*
 Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
-Método crearPersona que pida al usuario Nombre y fecha de nacimiento
 de la persona a crear. Retornar el objeto Persona creado.
-Método calcularEdad que calcule la edad del usuario utilizando el atributo
 de fecha de nacimiento y la fecha actual.
-Método menorQue recibe como parámetro una Persona y una edad. 
 Retorna true si la persona es menor que la edad consultada o false en caso contrario.
-Método mostrarPersona que muestra la información de la persona deseada.
*/


package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    
    private final Scanner scanner = new Scanner(System.in);
    
     public Persona crearPersona() {
        System.out.println("Ingrese los datos de la persona:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Fecha de nacimiento (dd/mm/yyyy): ");
        String fechaString = scanner.nextLine();
        Date fechaNacimiento = parseFecha(fechaString);
        return new Persona(nombre, fechaNacimiento);
    }

    public int calcularEdad(Persona persona) {
        Date fechaActual = new Date();
        long diffInMillies = Math.abs(fechaActual.getTime() - persona.getFechaNacimiento().getTime());
        long diff = diffInMillies / (24 * 60 * 60 * 1000);
        return (int) (diff / 365);
    }

    public boolean menorQue(Persona persona, int edad) {
        int edadPersona = calcularEdad(persona);
        return edadPersona < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
    }

    private Date parseFecha(String fechaString) {
        String[] partes = fechaString.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]) - 1;
        int anio = Integer.parseInt(partes[2]) - 1900;
        return new Date(anio, mes, dia);
    }
}
    

