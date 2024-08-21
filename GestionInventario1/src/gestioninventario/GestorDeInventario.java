/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioninventario;

import java.util.List;

public class GestorDeInventario {
    private CalculadoraDePrecio calculadoraDePrecio;

    public GestorDeInventario(CalculadoraDePrecio calculadorDePrecio) {
        this.calculadoraDePrecio = calculadorDePrecio;
    }

    public double calcularPrecioTotalInventario(List<Producto> productos) {
        return calculadoraDePrecio.calcularPrecioTotal(productos);
    }
}
