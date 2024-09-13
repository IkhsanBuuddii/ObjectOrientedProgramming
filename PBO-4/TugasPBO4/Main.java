/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_4;

/**
 *
 * @author User
 */
// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat objek Pekerja
        Pekerja pekerja = new Pekerja("Ikhsan", 25, "Programmer", 10000000);

        // Menampilkan informasi pekerja
        System.out.println(pekerja.toString());

        // Mengubah nama pekerja menggunakan metode setter
        pekerja.setNama("Budi");
        System.out.println("\nSetelah mengubah nama:");
        System.out.println(pekerja.toString());

        // Mencoba akses langsung atribut
        // pekerja.nama; // Error: nama has private access in Manusia
        // pekerja.usia; // Bisa diakses karena protected dan berada di kelas turunan
        // pekerja.gaji; // Error: gaji has private access in Pekerja
    }
}

