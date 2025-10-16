/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.juanfedevmaster.examplecollection;

import Entities.Product;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

/**
 *
 * @author jufeq
 */
public class ExampleCollection {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop Lenovo IdeaPad 5", 3200.00));
        products.add(new Product(2, "Mouse Logitech M510", 85.50));
        products.add(new Product(3, "Teclado Mecánico Redragon Kumara", 190.00));
        products.add(new Product(4, "Monitor Samsung 24'' Curvo", 780.00));
        products.add(new Product(5, "Disco Duro Externo Seagate 1TB", 310.00));
        products.add(new Product(6, "Memoria USB Kingston 64GB", 45.00));
        products.add(new Product(7, "Impresora HP DeskJet 2775", 410.00));
        products.add(new Product(8, "Tablet Samsung Galaxy A9", 1200.00));
        products.add(new Product(9, "Smartphone Xiaomi Redmi Note 13", 1350.00));
        products.add(new Product(10, "Cargador Portátil Anker 10000mAh", 220.00));
        products.add(new Product(11, "Audífonos Sony WH-CH520", 360.00));
        products.add(new Product(12, "Smartwatch Amazfit Bip 3", 290.00));
        products.add(new Product(13, "Router TP-Link Archer AX10", 270.00));
        products.add(new Product(14, "Cámara Web Logitech C920", 480.00));
        products.add(new Product(15, "MicroSD SanDisk 128GB", 95.00));
        products.add(new Product(16, "Base Refrigerante para Laptop", 110.00));
        products.add(new Product(17, "Parlantes Edifier R980T", 520.00));
        products.add(new Product(18, "Silla Ergonómica Nexa", 890.00));
        products.add(new Product(19, "Monitor LG Ultrawide 29''", 1100.00));
        products.add(new Product(20, "Teclado Inalámbrico Logitech MX Keys", 540.00));
        
        // Order list by
        products = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .collect(Collectors.toList());
        
        products = products.stream()
                .map(p -> new Product(
                        p.getProductId(),
                        p.getProductName().toUpperCase(),
                        p.getPrice()))
                .collect(Collectors.toList());
        
        // List with price is greater or equal than 300 
        List<Product> filterList = products.stream()
                .filter(p -> p.getPrice() >= 300)
                .collect(Collectors.toList());

        // List with price is lower than 300 
        List<Product> filterListLower = products.stream()
                .filter(p -> p.getPrice() < 300)
                .collect(Collectors.toList());

        // List with all Monitors
        List<Product> monitorList = products.stream()
                .filter(p -> p.getProductName().toLowerCase().contains("monitor"))
                .collect(Collectors.toList());

        // Get Firts result from the search
        Product firtsResult = products.stream()
                .filter(p -> p.getProductName().toLowerCase().contains("parlante"))
                .findFirst()
                .orElse(null);
        
        
        
        for (Product product : filterListLower) {
            System.out.println(product);
        }
        
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        if (firtsResult != null) {
            System.out.println(firtsResult);
        } else {
            System.out.println("Parlante is not found");
        }

    }
}
