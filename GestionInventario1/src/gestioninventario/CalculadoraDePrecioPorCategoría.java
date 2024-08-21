/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioninventario;

import java.util.List;

public class CalculadoraDePrecioPorCategoría implements CalculadoraDePrecio {
    private Categoria categoria;

    public CalculadoraDePrecioPorCategoría(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : categoria.getProductos()) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
}

