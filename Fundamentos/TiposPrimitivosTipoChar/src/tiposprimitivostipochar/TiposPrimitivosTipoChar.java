/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivostipochar;

/**
 *
 * @author Luciano Acosta
 */
public class TiposPrimitivosTipoChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        var miCaracter11 = 'a';
        System.out.println("miCaracter11 = " + miCaracter11);
        var varChar21 = '\u0021';
        System.out.println("varChar21 = " + varChar21);
        var varCharDecimal31 = 33;
        System.out.println("varCharDecimal31 = " + varCharDecimal31);
        
        int varCaracterSimbolo = '!'; //Devuelve el valor UNICODE del caracter
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        int letra = 'a';
        System.out.println("letra = " + letra);
    }
    
}
