package ClassAndObject;

public class Main {
 
    public static void main(String[] args) {
        Persona persona1 = new Persona("Cristian","Ramirez");
        Persona persona2 = new Persona("Edgar","Delgado");
        Persona persona3= new Persona("Esteban","Rojas",20);
    

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());

        persona1.setNombre("Juan");

        System.out.println("Nombre: " + persona1.getNombre());

        persona1.caminar();
        persona1.comer();
        persona1.ejercitar();
      
    
        
   
   
    }
}
