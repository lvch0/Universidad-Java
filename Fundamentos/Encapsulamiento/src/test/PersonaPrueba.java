package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Luciano", 400.00, false);
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Sueldo: " + persona1.getSueldo());
        System.out.println("Eliminado: " + persona1.isEliminado());
        System.out.println("person1: " + persona1);
        
        persona1.setNombre("Lucho");
        System.out.println("Nombre modificado con metodo set: " + persona1.getNombre());

        persona1.setSueldo(450.00);
        System.out.println("Sueldo modificado: " + persona1.getSueldo());
        System.out.println("persona1: " + persona1.toString());
    }
}
