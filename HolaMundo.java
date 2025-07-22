

// Clase principal

//Debe empezarse con mayuscula
//Sin espacios en blanco
//CamelCase
//Caracteres permitidos: letras, numeros

import java.util.Scanner;
import java.util.logging.Logger;

public class HolaMundo {
    private static final Logger logger = Logger.getLogger(HolaMundo.class.getName());
    public static void main(String[] args) {
        //Imprime en consola
        System.out.println("¡Hola, mundo desde Java!");
        logger.info("¡Hola, mundo desde Java!");

        // int edad = 20;
        // double altura = 1.75;
        // boolean esMayorDeEdad = true;
        // char genero = 'M';
        // long numeroDeTelefono = 1234567890;
        // float peso = 70.5f;

        // Integer edad2 = 20;
        // Double altura2 = 1.75;
        // Boolean esMayorDeEdad2 = true;
        // Character genero2 = 'M';
        // Long numeroDeTelefono2 = 1234567890L;
        // Float peso2 = 70.5f;

        // String nombre = "Juan carlos";
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Su nombre es: " + nombre);
        System.out.println("--------------------------------");
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Su edad es: " + edad);
        System.out.println("--------------------------------");
        System.out.println("Ingrese su altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Su altura es: " + altura);


       

    }
}