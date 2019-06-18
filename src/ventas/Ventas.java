/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import espe.ventas.Orden;
import espe.ventas.Producto;

/**
 *
 * @author labctr
 */
public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos los productos de la tienda
    Producto p1=new Producto("Camiseta",30.00);
    Producto p2=new Producto("Pantalon",60.00);
    Producto p3=new Producto("Zapatos",80.00);
    Producto p4=new Producto("Camisa",40.00);
    Producto p5=new Producto("Medias",5.00);
    Producto p6=new Producto("Abrigos",30.00);
    
    //Creamos una orden
    Orden orden1=new Orden();
    orden1.agregarProducto(p3);
    orden1.agregarProducto(p2);
    //imprimir la orden
    orden1.imprimirOrden();
    
    //Creamos una orden
    Orden orden2= new Orden();
    orden2.agregarProducto(p6);
    orden2.agregarProducto(p1);
    orden2.agregarProducto(p5);
    //imprimir la orden
    orden2.imprimirOrden();
    }
    
}
