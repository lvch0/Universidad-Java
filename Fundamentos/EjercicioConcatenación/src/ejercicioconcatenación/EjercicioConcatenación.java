/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioconcatenación;

/**
 *
 * @author Luciano Acosta
 */
public class EjercicioConcatenación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var cadena = "Lucho";
        var titulo = "Desarrollador";
        var union = titulo + " " + cadena;
        System.out.println(union);
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 5;
        
        System.out.println(i + j); //se realiza la suma de numeros
        System.out.println(i + j + cadena); //Evalucion de izquierda a derecha, realiza suma
        System.out.println(cadena + i + j); //Contexto cadena: Si primero encuentra una cadena el resto lo lee como cadena
        System.out.println(cadena + (i+j)); //Uso de parentesis modifican la prioridad en la evaluacion
    }
    
}
