package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(2D, 4);
        System.out.println("resultado2 = " + resultado2);
        
        //Se ejecuta el metodo de arg double por inferencia de tipos.
        //ya que es el unico que soporta el primer arg int y el segundo arg long
        var resultado3 = Operaciones.sumar(3, 5L); 
        System.out.println("resultado3 = " + resultado3);
    }
}
