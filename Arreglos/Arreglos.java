package Arreglos;

import java.util.ArrayList;
import java.util.List;

public class Arreglos {
    public static void main(String[] args) {
        // int[] numeros ;
        // numeros = new int[5];
        // numeros[0] = 1;
        // numeros[1] = 2;
        // numeros[2] = 3;
        // numeros[3] = 4;
        // numeros[4] = 5;
        // System.out.println(numeros.length);

        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Luis");
        // nombres.forEach(System.out::println);
        // nombres.remove(2);
        // 
        // System.out.println(nombres.size());
       
        for(int i = 0; i < 5; i++) {
            System.out.println("En numero es: " + i);
        }
        System.out.println(" fori--------------------------------");
        for(String nombre : nombres) {
            System.out.println("El nombre es: " + nombre);
        }

        System.out.println("Stream ForEach --------------------------------");
        
        nombres.forEach(nombre -> System.out.println("El nombre es: " + nombre));
        //nombres.forEach(System.out::println);


    }
}
