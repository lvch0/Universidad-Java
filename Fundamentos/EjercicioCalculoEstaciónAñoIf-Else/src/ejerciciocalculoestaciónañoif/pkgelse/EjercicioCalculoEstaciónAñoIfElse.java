/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocalculoestaciónañoif.pkgelse;

import java.util.Scanner;

/**
 *
 * @author Luciano Acosta
 */
public class EjercicioCalculoEstaciónAñoIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un mes");
        var mes = Integer.parseInt(entrada.nextLine());
        
        if (mes == 12 || mes == 1 || mes == 2) {
            System.out.println("Verano");
        } else if (mes == 3 || mes == 4 || mes == 5) {
            System.out.println("Otonio");
        } else if (mes == 6 || mes == 7 || mes == 8) {
            System.out.println("Invierno");
        } else if (mes == 9 || mes == 10 || mes == 11) {
            System.out.println("Primavera");
        }
        
    }
    
}
