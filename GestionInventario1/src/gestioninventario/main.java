/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioninventario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Crear proveedores
        Proveedor proveedor1 = new Proveedor("Proveedor 1");
        Proveedor proveedor2 = new Proveedor("Proveedor 2");

        // Crear productos
        ProductoElectronico producto1 = new ProductoElectronico("Laptop", 1000.0, 5, proveedor1, 24);
        ProductoAlimenticio producto2 = new ProductoAlimenticio("Manzanas", 1.0, 100, proveedor2, new Date());

        // Asignar productos a proveedores
        proveedor1.agregarProducto(producto1);
        proveedor2.agregarProducto(producto2);

        // Crear categorías
        Categoria categoria1 = new Categoria("Electronicos");
        Categoria categoria2 = new Categoria("Alimentos");

        // Asignar productos a categorías
        categoria1.agregarProducto(producto1);
        categoria2.agregarProducto(producto2);

        // Crear lista de productos
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);

        // Calcular precio total con descuento
        CalculadoraDePrecio calculadorConDescuento = new CalculadoraDePrecioConDescuento(0.1); // 10% de descuento
        GestorDeInventario gestorDeInventario = new GestorDeInventario(calculadorConDescuento);

        double precioTotal = gestorDeInventario.calcularPrecioTotalInventario(productos);
        System.out.println("Precio total con descuento: " + precioTotal);

        // Calcular precio total sin descuento
        CalculadoraDePrecio calculadoraDePrecioSinDescuento = new CalculadoraDePrecioSinDescuento();
        gestorDeInventario = new GestorDeInventario(calculadoraDePrecioSinDescuento);

        precioTotal = gestorDeInventario.calcularPrecioTotalInventario(productos);
        System.out.println("Precio total sin descuento: " + precioTotal);

        // Calcular precio total por categoría (Electrónicos)
        CalculadoraDePrecio calculadorPorCategoría = new CalculadoraDePrecioPorCategoría(categoria1);
        gestorDeInventario = new GestorDeInventario(calculadorPorCategoría);

        precioTotal = gestorDeInventario.calcularPrecioTotalInventario(productos);
        System.out.println("Precio total de la categoria 'Electronicos': " + precioTotal);

        // Calcular precio total por categoría (Alimentos)
        calculadorPorCategoría = new CalculadoraDePrecioPorCategoría(categoria2);
        gestorDeInventario = new GestorDeInventario(calculadorPorCategoría);

        precioTotal = gestorDeInventario.calcularPrecioTotalInventario(productos);
        System.out.println("Precio total de la categoria 'Alimentos': " + precioTotal);
    }
}
