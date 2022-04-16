package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        
        //miVariable = 5; //No se puede modificar una variable definida con final
        
        //Persona.MI_CONSTANTE = 5; No se pueden modificar variable FINAL
        System.out.println("Mi constante: " + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); No se puede asignar una nueva referencia a la variable persona1 porque se marco como FINAL
        persona1.setNombre("Juan"); //Se puede modificar el contenido o valor del objeto al cual esta apuntando dentro de la memoria pero no su referencia
        System.out.println("persona1 nombre: " + persona1.getNombre()); 
        persona1.setNombre("Roberto");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        
        //Se puede modificar el contenido del objeto al cual se esta apuntando pero no la referencia a ese objeto
    }
}
