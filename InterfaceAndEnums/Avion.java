package InterfaceAndEnums;

public class Avion implements Vehiculo {
   
    @Override
    public void encender() {
        System.out.println("El Avion se ha encendido");
    }

    
    public void apagar() {
        System.out.println("El Avion se ha apagado");
    }  

    public void acelerar() {
        System.out.println("El Avion se ha acelerado");
    }

    public void desacelerar() {
        System.out.println("El Avion se ha desacelerado");
    }
    
}
