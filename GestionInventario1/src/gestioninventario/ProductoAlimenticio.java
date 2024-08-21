/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioninventario;

import java.util.Date;

public class ProductoAlimenticio extends Producto {
    private Date fechaDeCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidad, Proveedor proveedor, Date fechaDeCaducidad) {
        super(nombre, precio, cantidad, proveedor);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public Date getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(Date fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    
    public String getDetalles() {
        return "Alimenticio: " + getNombre() + " - Caduca el: " + fechaDeCaducidad;
    }
}
