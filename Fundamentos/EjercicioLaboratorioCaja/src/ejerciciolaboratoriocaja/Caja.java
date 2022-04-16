package ejerciciolaboratoriocaja;

public class Caja {

    int ancho;
    int alto;
    int profundo;

    public Caja() {
        System.out.println("Ejecutando constructor");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        System.out.println("Ejecutando constructor con argumentos.");
    }

    public int calcuVolumen() {
        return (this.ancho * this.alto * this.profundo);
    }

}
