package com.company;

public class Cliente extends Thread {


    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Cliente - Voy a esperar a que me traigan comida...");
                Camarero camarero = new Camarero();
                camarero.start();
                camarero.join();
                System.out.println("Cliente - Voy a consumir la comida en 3 segundos");
                sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
