/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author User
 */
// File: Praktikum_PBO4.java (dalam package praktikum4)

public class Praktikum_PBO4 {
    public static void main(String[] args) {
        // Membuat objek dari kelas Kendaraan
        Kendaraan mobil1 = new Kendaraan("Toyota", 180, "Bensin");
        
        // Menampilkan data awal
        System.out.println("Nama: " + mobil1.getNama());
        System.out.println("Kecepatan Maksimum: " + mobil1.getkecepatanMaks() + " km/h");
        System.out.println("Jenis Mesin: " + mobil1.getjenisMesin());

        // Mengubah data menggunakan setter
        mobil1.setNama("Honda");
        mobil1.setkecepatanMaks(200);
        mobil1.setjenisMesin("Diesel");

        // Menampilkan data setelah perubahan
        System.out.println("\nSetelah perubahan:");
        System.out.println("Nama: " + mobil1.getNama());
        System.out.println("Kecepatan Maksimum: " + mobil1.getkecepatanMaks() + " km/h");
        System.out.println("Jenis Mesin: " + mobil1.getjenisMesin());

        // Membuat objek dari kelas Mobil dan menampilkan informasinya
        Mobil mobil2 = new Mobil("Mitsubishi", 220, "Bensin", 4);
        mobil2.tampilkanInfoMobil();
    }
}

