package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Luchito";
        System.out.println("persona1 = " + persona1);
        cambioValor(persona1);
        System.out.println("persona1 con cambio de valor: "+persona1.nombre);
    }
    public static Persona cambioValor (Persona persona) { //Retorno de tipo object
        // if (persona == null) {
        //      return null;
        // }
        persona.nombre = "Karla";
        return persona;
    }
}
