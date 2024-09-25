/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author cfp403lujan
 */
public class Producto {
    private int id;
    private String detalle;
    private String fechaCompra;
    private double precioVenta;
    private int stock;

    public Producto() {
    }

    public Producto(int id, String detalle, String fechaCompra, double precioVenta, int stock) {
        this.id = id;
        this.detalle = detalle;
        this.fechaCompra = fechaCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getDetalle() {
        return detalle;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", detalle=" + detalle + ", fechaCompra=" + fechaCompra + ", precioVenta=" + precioVenta + ", stock=" + stock + '}';
    }
    
    
}
