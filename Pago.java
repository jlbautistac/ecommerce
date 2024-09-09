package src.ecommerce;

import java.util.Random;

public class Pago {
    private Pedido pedido;
    private String metodoPago;
    private double cantidad;

    public Pago(Pedido pedido, String metodoPago, double cantidad) {
        this.pedido = pedido;
        this.metodoPago = metodoPago;
        this.cantidad = cantidad;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void procesarPago() throws InterruptedException {
        Random random = new Random();
        int delay = getRandomDelay(random);
        System.out.println("Procesando pago para el pedido " + pedido.getNumPedido() + " con un retraso de " + delay + "ms.");
        Thread.sleep(delay);
        System.out.println("Pago procesado por la cantidad de " + cantidad + " usando " + metodoPago);
    }

    public static int getRandomDelay(Random random) {
        int[] delays = {1000, 1500, 2000, 3000};
        return delays[random.nextInt(delays.length)];
    }
}
