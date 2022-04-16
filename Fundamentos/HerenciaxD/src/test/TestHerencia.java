package test;

import domain.Empleado;
import domain.Cliente;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Lucho", 5000.0);
        System.out.println("empleado1 = " + empleado1);

//        Cliente cliente1 = new Cliente(new Date(), true, "Karla", 'F', 28, "Saturno 123");
//        System.out.println("cliente1 = " + cliente1);
    }

}
