package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{
        System.out.println("Ejecucion de bloque estatico");
        ++Persona.contadorPersonas;
    }
    
    {
        System.out.println("Ejecucion bloque NO estatico");  //bloque dinamico
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }
    
    
}
