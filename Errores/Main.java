package Errores;

public class Main {
    
    public static void main(String[] args) {
       
     Animal animal = new Perro();
     Animal animal2 = new Gato();


     animal.haceSonido();
     animal2.haceSonido();
       
        int a = 2;
        int b = 1;
         int c;
        try {
        
            c = a / b;
            System.out.println("El resultado es: " + c);
        }catch(ArithmeticException e){
            System.out.println("Error: " +e); // TODO: handle exception
        } catch (Exception e) {
           
           System.out.println("Error: " +e); // TODO: handle exception
        }finally{
            System.out.println("Pase por el catch");
        }
  
      





    }
}
