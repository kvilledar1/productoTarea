/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioninventario;

public class ProductoElectronico extends Producto {
    private int garantia; // en meses

    public ProductoElectronico(String nombre, double precio, int cantidad, Proveedor proveedor, int garantia) {
        super(nombre, precio, cantidad, proveedor);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    
    public String getDetalles() {
        return "Electronico: " + getNombre() + " - Garantía: " + garantia + " meses";
    }
}
