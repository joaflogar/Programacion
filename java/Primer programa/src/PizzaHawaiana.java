public final class PizzaHawaiana extends Pizza {

    int precio;
    public PizzaHawaiana(String Codigo, String nombreCliente, int cantidad) {
        super(Codigo, nombreCliente, cantidad);
    }

    @Override
    public int calcularPrecio() {
        precio = 30 * cantidad;
        return precio;
    }

}
