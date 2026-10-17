
public abstract sealed class Pizza permits PizzaAmericana, PizzaHawaiana, PizzaSuprema {
    protected String Codigo;
    protected String nombreCliente;
    protected int cantidad;

    public Pizza(String Codigo, String nombreCliente, int cantidad) {
        this.Codigo = Codigo;
        this.nombreCliente = nombreCliente;
        this.cantidad = cantidad;
    }

    public abstract int calcularPrecio();
}
