package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        persona1.nombre = "Luciano";
        persona1.apellido = "Acosta";
        persona1.desplegarInformacion();
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona();
        
        persona2.nombre = "Karla";
        persona2.apellido = "Perguer";
        persona2.desplegarInformacion();
        System.out.println("persona2 = " + persona2);  
        
        
    }
}
