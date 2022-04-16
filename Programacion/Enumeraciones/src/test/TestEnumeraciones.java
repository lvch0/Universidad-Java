package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia 1 de la semana: " + Dias.LUNES);
//        indicarDiaSemana(Dias.LUNES);

          System.out.println("Continente no. 4: " + Continentes.AMERICA);
          System.out.println("Cantidad de paises del 4to contienente: " + Continentes.AMERICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana: " + Dias.LUNES);
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana: " + Dias.MARTES);
            case MIERCOLES:
                System.out.println("Tercer dia de la semana: " + Dias.MIERCOLES);
            case JUEVES:
                System.out.println("Cuarto dia de la semana: " + Dias.JUEVES);
            case VIERNES:
                    System.out.println("Quinto dia de la semana: " + Dias.VIERNES);
            case SABADO:
                System.out.println("Sexto dia de la semana: " + Dias.SABADO);
            case DOMINGO:
                System.out.println("Septimo dia de la semana: " + Dias.DOMINGO);
        }   
    }
}
