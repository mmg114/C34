package ClassAndObject;

public class Persona {
     private String nombre;
     private String apellido;    
    int edad;
    double altura;
    char genero;
       double peso;

//Crear constructor con todos los atributos

      public String getNombre() {
        return nombre;
      }
      public String getApellido() {
        return apellido;
      }

      public void setNombre(String nombre) {
        this.nombre = nombre;
      }
      public void setApellido(String apellido) {
        this.apellido = apellido;
      }
      
  
     public Persona() {}

     public Persona(String nombre,String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
     }

     public Persona(String nombre,String apellido,int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
     }




      void caminar() {
        System.out.println("Caminando...");
      }
        void comer() {
        System.out.println("Comiendo...");
      }
      void ejercitar() {
        System.out.println("Ejercitando...");
      }
}
