package src.ecommerce;

public class Pedido {
    private Cliente cliente;
    private int numPedido;
    private String[] articulos;

    public Pedido(Cliente cliente, int numPedido, String[] articulos) {
        this.cliente = cliente;
        this.numPedido = numPedido;
        this.articulos = articulos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public String[] getArticulos() {
        return articulos;
    }
}
