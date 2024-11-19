/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kelas Produk untuk Serialisasi
public class SystemInventory {
    private static final String TEXT_FILE = "products.txt";
    private static final String SERIAL_FILE = "products.ser";
    private static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Product");
            System.out.println("2. Save to Text File");
            System.out.println("3. Save Objects to Serialized File");
            System.out.println("4. Display All Products");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1 -> addProduct(scanner);
                case 2 -> saveToTextFile();
                case 3 -> saveToSerializedFile();
                case 4 -> displayProducts();
                case 5 -> {
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void addProduct(Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter stock: ");
        int stock = scanner.nextInt();
        productList.add(new Product(name, price, stock));
        System.out.println("Product successfully added.");
    }

    private static void saveToTextFile() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Product product : productList) {
                writer.write(product.toString() + "\n");
            }
            System.out.println("Product data successfully saved to text file.");
            System.out.println("File saved at: " + TEXT_FILE);
        } catch (IOException e) {
            System.out.println("An error occurred while saving to text file.");
            e.printStackTrace();
        }
    }

    private static void saveToSerializedFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(productList);
            System.out.println("Product objects successfully saved to serialized file.");
            System.out.println("File saved at: " + SERIAL_FILE);
        } catch (IOException e) {
            System.out.println("An error occurred while saving to serialized file.");
            e.printStackTrace();
        }
    }

    private static void displayProducts() {
        System.out.println("Product List:");
        for (Product product : productList) {
            product.displayInfo();
        }
    }
}