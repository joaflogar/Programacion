public final class PizzaAmericana extends Pizza {

    int precio;
    public PizzaAmericana(String Codigo, String nombreCliente, int cantidad) {
        super(Codigo, nombreCliente, cantidad);
    }

    @Override
    public int calcularPrecio() {
        precio = 25 * cantidad;
        return precio;
    }

}
