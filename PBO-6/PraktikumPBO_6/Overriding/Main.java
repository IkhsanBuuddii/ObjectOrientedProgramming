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
        // Menggunakan polimorfisme runtime
        Hewan hewan = new Kucing();
        hewan.bersuara(); // Output: Meow
        
        // Membuat objek Kucing dan memanggil metode makan()
        Kucing kucing = new Kucing();
        kucing.makan("ikan"); // Memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2); // Memanggil metode makan() yang overloaded
        
        // Membuat objek Anjing dan memanggil metode bersuara()
        Hewan hewanAnjing = new Anjing();
        hewanAnjing.bersuara(); // Output: Woof
        hewanAnjing.makan("daging", 3); // Memanggil metode makan() yang overloaded dari kelas Hewan
    }
}
