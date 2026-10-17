public final class PizzaSuprema extends Pizza {

    int precio;
    public PizzaSuprema(String Codigo, String nombreCliente, int cantidad) {
        super(Codigo, nombreCliente, cantidad);
    }

    @Override
    public int calcularPrecio() {
        precio = 35 * cantidad;
        return precio;
    }

}
