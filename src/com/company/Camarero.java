package com.company;

public class Camarero extends Thread {

    @Override
    public void run() {
        try {
            prepararComanda();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void prepararComanda() throws InterruptedException {
        System.out.println("Camarero - Si he llegado aqui es porque el cliente ha pedido comida. Debo llevarla");
        System.out.println("Me han pedido un zumo");
        sleep(1000);
        System.out.println("Me han pedido una tostada");
        sleep(1000);
        System.out.println("Me han pedido mermelada");
        sleep(1000);
        System.out.println("Camarero - El pedido ya esta listo. Tardo 5 segundos en llevarle la comida al cliente");
        sleep(5000);
    }
}
