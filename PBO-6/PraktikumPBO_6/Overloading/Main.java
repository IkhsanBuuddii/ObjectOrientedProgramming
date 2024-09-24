/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author User
 */
// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.bersuara(); // Output: Hewan bersuara
        kucing.makan("ikan"); // Memanggil metode makan() yang di-overload
        kucing.makan("ikan", 2); // Memanggil metode makan() yang overloaded
    }
}

