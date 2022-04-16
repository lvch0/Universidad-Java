
package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    
    //Constructor con args (Sobrecarga de constructores)
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con args");
    }
    
    //Metodo
    public void sumar() {
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }
    public int sumarConRetorno() {
        return this.a + this.b;
    }
    public int sumarConArgumentos (int a, int b) {
        this.a = a; //El argumento a hace referencia al atributo this.a
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();
    }
}
