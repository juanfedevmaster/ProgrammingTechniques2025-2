/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 * Clase que se encargará de manejar los atributos de Productos.
 * @author jufeq
 */
public class Product {

    private int productId;
    private String productName;
    private double price;
    
    /**
     * Constructor vacio o por defecto
     */
    public Product() {
    }
    
    /**
     * Constructor con parametros para la instancia de un producto
     * con valores.
     * @param productId Id del producto que se va a instanciar
     * @param productName Nombre del producto que se va a instanciar
     * @param price Precio del producto a instanciar
     */
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        //return "The price of the product is: $"  + this.price;
        return "The name of the product is: " + this.productName
                + ", and the price is: $" + this.price;
    }
}
