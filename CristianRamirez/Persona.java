public class Persona {
    String nombre;
    String apellido;
    int edad;
    double altura;
    char genero;
    double peso;


    public Persona(String nombre, String apellido, int edad, double altura, char genero, double peso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.genero = genero;
        this.peso = peso;
        
        System.out.println("persona creada con los siguientes datos: ");

        presentarse();
    }

    void presentarse(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Genero: " + genero);
        System.out.println("Peso: " + peso);
    }


    void caminar(){
        System.out.println("Caminando...");
        System.out.println("Persona caminando...");
    }

    void comer(){
        System.out.println("Comiendo...");
        System.out.println("Persona comiendo...");
    }
    void ejercitar(){
        System.out.println("Ejercitando...");
        System.out.println("Persona ejercitando...");
    }
    void hablar(){
        System.out.println("Hablando...");
        System.out.println("Persona hablando...");
    }
    void pensar(){
        System.out.println("Pensando...");
        System.out.println("Persona pensando...");
    }
}
