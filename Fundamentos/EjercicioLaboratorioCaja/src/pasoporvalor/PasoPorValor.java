
package pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x nuevo valor = " + x);
        
        cambiarValor(x); //Toma este valor como argumento del metodo cambiarValor()
    }
    public static void cambiarValor(int arg1) { //Solo recibe una copia valor primitivo
        System.out.println("arg1 = " + arg1);
        arg1 = 15; //No cambia el valor definido desde otro metodo
    }
}
