package EstructurasDeFlujo;

public class Main {
    public static void main(String[] args) {
        int edad = 12;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        System.out.println("--------------------------------");
        String mensajeAmostrar = edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(mensajeAmostrar);
    
        System.out.println("--------------------------------");
        int diaDeLaSemana = 2;
        switch (diaDeLaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No es un dia de la semana");
                break;
        }

        System.out.println("--------------------------------");
        
    String nombreDelDiaDeLaSemana = switch (diaDeLaSemana) {
        case 1 -> "Lunes";
        case 2 -> "Martes";
        case 3 -> "Miercoles";
        case 4 -> "Jueves";
        case 5 -> "Viernes";
        case 6 -> "Sabado";
        case 7 -> "Domingo";
        default -> "No es un dia de la semana";
    };
        System.out.println(nombreDelDiaDeLaSemana);
    };
    
    
}
