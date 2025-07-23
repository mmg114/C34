package InterfaceAndEnums;

public class Carro implements Vehiculo {

    @Override
    public void encender() {
        System.out.println("El carro se ha encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El carro se ha apagado");
    }

  
}
