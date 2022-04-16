//Mi clase en Java
public class HolaMundo {
   public static void main(String args[]) {
       int miVariableEntera = 10;
       System.out.println(miVariableEntera);
       
       miVariableEntera = 15;
       System.out.println(miVariableEntera);
       
       String miVariableCadena = "altoke roque";
       System.out.println(miVariableCadena);
       
       miVariableCadena = "nv";
       System.out.println(miVariableCadena);
       
       //var - inferencia de tipos en Java
       
       var miVariableEntera2 = 10;
       System.out.println(miVariableEntera2);
       
       var miVariableCadena2 = "Nueva Cadena";
       System.out.println("miVariableCadena2 = " + miVariableCadena2);
       
       //Valores permitidos en el nombre de variables
       var miVariable = 1;
       var _miVariable = 2;
       var $miVariable = 3;
       // var áVariable = 10; No se recomienda utilizar
       // var #miVariable = 2; no se permite utilizar características especiales
   } 
}
