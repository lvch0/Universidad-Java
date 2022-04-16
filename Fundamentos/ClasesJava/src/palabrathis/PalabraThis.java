package palabrathis;

public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona apellido= " + persona.apellido);
        System.out.println("persona nombre: " + persona.nombre);
    }
}

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        //super(); llamada al constructor de la calse Padre (object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this: " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir {

    public Imprimir() {
        super();//el constructor de la clase object (padre) para reservar memoria
    }

    public void imprimir(Persona persona) {
        System.out.println("persona desde imprimir: " + persona);
        System.out.println("impresion del objeto actual (this): " + this);
    }
}
