package autoboxingunboxing;

public class AutoboxingUnboxing {

    public static void main(String[] args) {
        //Clases Envolventes de tipos primitivos
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        doolean = Boolean
        byte - Byte
        char - Character
        short - Short
        */
        
        Integer entero = 10; //Autoboxing
        System.out.println("entero = " + entero);
        System.out.println("entero double= " + entero.doubleValue());
        
        int entero2 = entero; //Unboxing
        System.out.println("entero2 = " + entero2);
    }
    
}
