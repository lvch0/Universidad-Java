package test;

import java.util.*;

public class testColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();  //List permite guardar en orden
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes"); //Se puede duplicar elementos
        //String elemento = miLista.get(0);
       // System.out.println("elemento = " + elemento);
        //imprimir(miLista);
        
        Set<String> miSet = new HashSet<>();  //Set no permite guardar ordenadamente
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes"); //No se pued duplicar elementos
//        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        
        String elemento = (String) miMapa.get("valor1");
//        System.out.println("elemento = " + elemento);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        
    }
    
    public static void imprimir(Collection<String> coleccion){
        for(Object elemento: coleccion){
            System.out.println("elemento = " + elemento);
        }
        
//        coleccion.forEach(elemento -> {
////            System.out.println("elemento = " + elemento);
//        });
    }
}
