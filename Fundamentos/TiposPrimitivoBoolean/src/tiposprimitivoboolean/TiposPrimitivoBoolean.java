/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivoboolean;

/**
 *
 * @author Luciano Acosta
 */
public class TiposPrimitivoBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var edad = 10;
        var esAdulto = edad >= 18;
        
        if (esAdulto) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }
    
}
