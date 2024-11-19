/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12_1;

import java.io.*;

/**
 *
 * @author User
 */
public class SerializablePractice {
    public static void main(String[] args) {
        String filePath = "product.ser";

        // Create a product object
        Product product1 = new Product("Laptop", 7000000, 5);

        // Serialize the product object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(product1);
            System.out.println("Product object successfully saved to file: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the file.");
            e.printStackTrace();
        }

        // Deserialize the product object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Product deserializedProduct = (Product) ois.readObject();
            System.out.println("\nProduct object successfully read from file:");
            deserializedProduct.displayInfo();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
