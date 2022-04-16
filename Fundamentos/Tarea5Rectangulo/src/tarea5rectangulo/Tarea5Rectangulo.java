package tarea5rectangulo;

import java.util.Scanner;

public class Tarea5Rectangulo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Proporcione la altura:");
        var alto = Integer.parseInt(entrada.nextLine());

        System.out.println("Proporcione el ancho:");
        var ancho = Integer.parseInt(entrada.nextLine());

        var area = alto * ancho;
        var perimetro = (alto + ancho) * 2;

        System.out.println("El Area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}
