package paquete1;

import paquete1.Clase1;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Publico");
        clase1.setAtributoDefault("cambio valor atributo");
        System.out.println("clase1 privado = " + clase1.getAtributoDefault());
    }
}
