package com.iudigital.entrega2;

import cliente.Cajera;
import cliente.Producto;
import cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Entrega2 {
    public static void main(String[] args) {

        Cajera cajera1 = new Cajera(1);
        Cajera cajera2 = new Cajera(2);

        Producto producto1 = new Producto("Pan", 2.5);
        Producto producto2 = new Producto("Leche", 1.8);

        List<Producto> productosCliente1 = new ArrayList<>();
        productosCliente1.add(producto1);
        productosCliente1.add(producto2);

        List<Producto> productosCliente2 = new ArrayList<>();
        productosCliente2.add(producto1);
        productosCliente2.add(producto2);

        Cliente cliente1 = new Cliente(1, productosCliente1);
        Cliente cliente2 = new Cliente(2, productosCliente2);

        cajera1.cobrar(cliente1);
        cajera2.cobrar(cliente2);

        // Iniciar hilos para simular el proceso de cobro concurrente
        cajera1.start();
        cajera2.start();
    }
}


