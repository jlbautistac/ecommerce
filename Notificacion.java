package src.ecommerce;

import java.util.Random;

public class Notificacion {
    private Pedido pedido;
    private String correo;

    public Notificacion(Pedido pedido, String correo) {
        this.pedido = pedido;
        this.correo = correo;
    }

    public void enviarNotificacion() throws InterruptedException {
        Random random = new Random();
        int delay = getRandomDelay(random);
        System.out.println("Enviando notificación por correo para el pedido " + pedido.getNumPedido() + " con un retraso de " + delay + "ms.");
        Thread.sleep(delay);
        System.out.println("Notificación enviada a " + correo);
    }
    
    public static int getRandomDelay(Random random) {
        int[] delays = {1000, 1500, 2000, 3000};
        return delays[random.nextInt(delays.length)];
    }
}

