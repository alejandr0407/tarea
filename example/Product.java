package com.example;

public class Product {
    private String id, name;
    private double price;
    private int stock;

    public Product() {
        this.id = null;
        this.name = null;
        this.price = 0.0;
        this.stock = 0;
    }

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        setPrice(price);  
        setStock(stock);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }

    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + name);
        System.out.println("Precio: " + price);
        System.out.println("Stock: " + stock);
    }

}
