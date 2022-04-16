package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Karla", 10000);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        Gerente gerente1 = new Gerente("Juan", 5000, "sistemas");
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        imprimir(gerente1);  //polimorfismo
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
