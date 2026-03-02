package com.example;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setId("P001");
        p1.setName("Televisor");
        p1.setPrice(1500000);
        p1.setStock(40);

    
        Product p2 = new Product("002", "Nevera", 24000000, 100);

        
        p2.setPrice(20.0);
        p2.setStock(120);

    
        System.out.println("Nombre producto 1: " + p1.getName());
        System.out.println("Precio producto 1: " + p1.getPrice());

        System.out.println("-------------------------");

        System.out.println("Nombre producto 2: " + p2.getName());
        System.out.println("Stock producto 2: " + p2.getStock());

        System.out.println("-------------------------");

        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    
    }
}