/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author Luciano Acosta
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Tipos primitivos: byte, short, int, long
        */
        byte numerobyte = (byte)129;
        System.out.println("Valor byte "+numerobyte);
        System.out.println("Valor minimo: "+Byte.MIN_VALUE);
        System.out.println("Valo maximo: "+Byte.MAX_VALUE);
        
        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo "+Short.MIN_VALUE);
        System.out.println("Valor maximo: "+Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo: "+Integer.MIN_VALUE);
        System.out.println("Valor maximo: "+Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo: "+Long.MIN_VALUE);
        System.out.println("valor maximo: "+Long.MAX_VALUE);
            
        /*
        Tipo primitivos flotantes: float y double
        */
        float numFloat = (float)3.4028235E38D;
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo: "+Float.MIN_VALUE);
        System.out.println("Valor maximo: "+Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo: "+Double.MIN_VALUE);
        System.out.println("Valor maximo: "+Double.MAX_VALUE);
        
    } 
    
}
