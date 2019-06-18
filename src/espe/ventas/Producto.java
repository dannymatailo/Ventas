/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.ventas;

/**
 *
 * @author labctr
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    public Producto() {
        this.idProducto=++contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString(){
        return "Producto { "+" IdProducto# " + idProducto + ", nombre = " + nombre + ", precio = " + precio + "}";
    }
}
