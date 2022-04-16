
package ejercicio3tienda.de.libros;

import java.util.Scanner;


public class Ejercicio3TiendaDeLibros {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Proporciona el nombre:");
        var nombre = entrada.nextLine();
        
        System.out.println("Proporciona el id:");
        var cod = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Proporciona el precio");
        var precio = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Proporciona el envio gratuito:");
        var envio = true;
        
        System.out.println(nombre+" #"+cod);
        System.out.println("Precio: $"+precio);
        System.out.println("Envio gratuito: "+envio);
        
    }
    
}
