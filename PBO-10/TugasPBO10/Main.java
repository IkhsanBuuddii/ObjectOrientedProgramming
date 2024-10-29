/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO10;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){
        // Elektronik
        Elektronik TV = new Elektronik();
        double hargaTV = 3000000;
        double pajakElektronik = TV.hitungPajak(hargaTV);
        System.out.println("Harga TV: Rp. " + hargaTV);
        System.out.println("Pajak Eletronik(10%): Rp. " + pajakElektronik);
        
        // Makanan
        Makanan MiePangsit = new Makanan();
        double hargaMiePangsit = 20000; // Contoh harga untuk produk Makanan
        double pajakMakanan = MiePangsit.hitungPajak(hargaMiePangsit);
        System.out.println("\nHarga Mie Pangsit: Rp. " + hargaMiePangsit);
        System.out.println("Pajak Makanan (5%): Rp. " + pajakMakanan);

    }
}    