/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocalculoestaciónswtich;

/**
 *
 * @author Luciano Acosta
 */
public class EjercicioCalculoEstaciónSwtich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var mes = 9;
        var estacion = "Estacion desconocida";
        
        switch (mes) {
            case 12: case 1: case 2:
                System.out.println("Verano");
                break;
            case 3: case 4: case 5:
                System.out.println("Otonio");
                break;
            case 6: case 7: case 8:
                System.out.println("Invierno");
                break;
            case 9: case 10: case 11:
                System.out.println("Primavera");
                break;
        }
    }
    
}
