package InterfaceAndEnums;

public enum Prioridad {
    BAJA(1),MEDIA(2),ALTA(3);

    private int valor;

    Prioridad(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
