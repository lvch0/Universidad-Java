package test;

import TestExcepciones.OperacionExcepcion;
import static aritmetica.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado =0;
        try{
           resultado = division(10, 0); 
        } 
        catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion: ");
            System.out.println(e.getMessage());
        } 
        catch(Exception e){
//            e.printStackTrace(System.out);
            System.out.println("Ocurrio un error de tipo Exception: ");
            System.out.println(e.getMessage());
        }  
        finally {
            System.out.println("Se reviso la division entre cero");
        }
        
        System.out.println("resultado = " + resultado);
    }
}
