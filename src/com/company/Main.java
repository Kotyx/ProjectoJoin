package com.company;

public class Main {


    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        // Es importante que empiece el camarero ya que se queda esperando.
        cliente.start();
    }


}
