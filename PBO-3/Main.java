/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_3;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class Mobil
        Mobil Ruekhan = new Mobil("Toyota", "Camry", 2020, "Hitam");
        Mobil Riekhan = new Mobil("Honda", "Civic", 2021, "Putih");

        // Menampilkan informasi mobil
        System.out.println("Informasi Ruekhan:");
        Ruekhan.displayInfo();
        Ruekhan.nyalakanMesin();

        System.out.println("\nInformasi Riekhan:");
        Riekhan.displayInfo();
        Riekhan.nyalakanMesin();

        // Mengubah warna mobil1 dan menampilkan informasi lagi
        Ruekhan.set("warna", "Merah");
        System.out.println("\nInformasi Ruekhan setelah perubahan warna:");
        Ruekhan.displayInfo();
    }
}
