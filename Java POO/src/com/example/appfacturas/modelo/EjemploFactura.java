package com.example.appfacturas.modelo;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Pepito Perez");
        cliente.setRFC("PEPE012713");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la descripción de la factura: ");
        String desc = scanner.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;
        System.out.println();

        for(int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese el producto: " + producto.getCodigo() + ": ");
            producto.setNombre(scanner.nextLine());
            System.out.print("Ingrese el precio: ");
            producto.setPrecio(scanner.nextFloat());
            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(scanner.nextInt(), producto));
            System.out.println();
            scanner.nextLine();
        }
        System.out.println(factura);
    }
}
