/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12_1;
import java.io.Serializable;

/**
 *
 * @author User
 */

class Product implements Serializable {
    private String productName;
    private double price;
    private int stock;

    // Constructor
    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    // Display product information
    public void displayInfo() {
        System.out.println("Product Name: " + productName + ", Price: " + price + ", Stock: " + stock);
    }

    // Override toString method for file saving
    @Override
    public String toString() {
        return "Product Name: " + productName + ", Price: " + price + ", Stock: " + stock;
    }
}

