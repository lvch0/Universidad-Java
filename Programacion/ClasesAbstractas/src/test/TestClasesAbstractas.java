package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica(); No se permite crear objetos de la clase padre abstracta
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo");  //Upcasting
        figura.dibujar();
    }
}
