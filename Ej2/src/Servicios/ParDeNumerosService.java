/*
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
-Método mostrarValores que muestra cuáles son los dos números guardados.
-Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
-Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
Previamente se deben redondear ambos valores.
-Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/


package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosService {
    
    public void mostrarValores (ParDeNumeros par) {
        System.out.println("Numero 1: " + par.getNum1());
        System.out.println("Numero 2: " + par.getNum2());
    }
    
    public double devolverMayor(ParDeNumeros par) {
        return Math.max(par.getNum1(), par.getNum2());
    }
    
    public double calcularPotencia(ParDeNumeros par) {
        double mayor = devolverMayor(par);
        double menor = Math.min(par.getNum1(), par.getNum2());
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(mayor, menor);
    }
    
    public double calculaRaiz(ParDeNumeros par) {
        double menor = Math.min(par.getNum1(), par.getNum2());
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
    
}
