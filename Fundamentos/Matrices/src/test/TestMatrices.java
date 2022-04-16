package test;
 
import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 7;
        edades[0][1] = 3;
        edades[1][0] = 6;
        edades[1][1] = 1;
        edades[2][0] = 9;
        edades[2][1] = 5;
        
        for (int filas = 0; filas < edades.length; filas++) {
            for (int colum = 0; colum < edades[filas].length; colum++) {
                System.out.println("edades " + filas + " - " + colum + " : " + edades[filas][colum]);
            }
        }
        
        String frutas[][] = {{"Naranja","Pomelo"},{"Fresa","Zarzamora","Mora"}};    
        imprimir(frutas);
        
        Persona personas[][] = new Persona[2][3];
    
        personas[0][0] = new Persona("Luchito");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Juan");
        personas[1][0] = new Persona("Lucia");
        personas[1][1] = new Persona("Luciana");
        personas[1][2] = new Persona("Eva");
        
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]) {
        
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int colum = 0; colum < matriz[filas].length; colum++) {
                System.out.println("matriz " + filas + " - " + colum + ": " + matriz[filas][colum]);
            }      
        }
    }
    
}
