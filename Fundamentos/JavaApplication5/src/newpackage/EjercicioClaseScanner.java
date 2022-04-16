/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Luciano Acosta
 */
public class EjercicioClaseScanner {
    public static void main(String args[]) {
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre); 
        
        System.out.println("Ecribe tu titulo:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: "+titulo+" "+nombre);  
    }
}
