/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanfedevmaster.abarromaxapp.Models;

import java.time.LocalDateTime;

/**
 *
 * @author jufeq
 */
public class Inventario {
    private Producto producto;
    private int cantidad;                 // stock actual
    private LocalDateTime ultimaActualizacion;

    public Inventario() {
    }

    public Inventario(Producto producto, int cantidad, LocalDateTime ultimaActualizacion) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.ultimaActualizacion = ultimaActualizacion;
    }
    
    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.ultimaActualizacion = LocalDateTime.now();
    }
    public LocalDateTime getUltimaActualizacion() { return ultimaActualizacion; }
}