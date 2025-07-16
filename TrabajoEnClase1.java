import java.util.Scanner;

public class TrabajoEnClase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor a convertir en dolares: "); 
        double valor = scanner.nextDouble();

        int valorDolar= 4010;

        double valorConvertido = valor * valorDolar;

        System.out.println("El valor convertido es: " + valorConvertido);
    }

}