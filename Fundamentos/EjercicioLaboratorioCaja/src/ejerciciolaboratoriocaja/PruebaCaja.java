package ejerciciolaboratoriocaja;

public class PruebaCaja {

    public static void main(String[] args) {

        Caja caja1 = new Caja();
        caja1.ancho = 6;
        caja1.alto = 6;
        caja1.profundo = 6;
        var resultado = caja1.calcuVolumen();
        System.out.println("resultado = " + resultado);

        Caja caja2 = new Caja(3, 2, 6);
        resultado = caja2.calcuVolumen();
        System.out.println("resultado = " + resultado);
    }
}
