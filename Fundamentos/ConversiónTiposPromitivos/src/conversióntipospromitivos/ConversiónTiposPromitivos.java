/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversióntipospromitivos;

import java.util.Scanner;

/**
 *
 * @author Luciano Acosta
 */
public class ConversiónTiposPromitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        var edad = Integer.parseInt("20");
//        System.out.println("edad = " + (edad + 1));
//        
//        var valorPI = Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
//        
        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese su edad:");
//        edad = Integer.parseInt(entrada.nextLine());
//        System.out.println("edad = " + edad);
        
           var edadTexto = String.valueOf(10);
           System.out.println("edadTexto = " + edadTexto);
           
           var text = "hola".charAt(2);
           System.out.println("text = " + text);
           
           System.out.println("Ingrese un caracter:");
           text = entrada.nextLine().charAt(0);
           System.out.println("text = " + text);
    }
            
    
}
