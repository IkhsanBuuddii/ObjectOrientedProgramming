/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12_1;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author User
 */
public class InputOutput {
    public static void main(String[] args) {
        String filePath = "data.txt";
        
        // Write data into file
        try (FileWriter penulis = new FileWriter(filePath)) {
            penulis.write("Belajar I/O hanya dalam sekali keras \n");
            penulis.write("Object Oriented Programming 12 \n");
            System.out.println("Data successfully added into: " + filePath);
        } catch (IOException e) {
            System.out.println("There was a problem writing the file.");
            e.printStackTrace();
        }
        
        // Read data in file
        try (FileReader pembaca = new FileReader(filePath)) {
            int character;
            System.out.println("\nFile Contents:");
            while ((character = pembaca.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("There was a problem reading the file.");
            e.printStackTrace();
        }
    }
}