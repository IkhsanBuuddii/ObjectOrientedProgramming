/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_6;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Buku buku = new Buku("Belajar Java", 100000, 10); // Diskon 10%
        Elektronik elektronik = new Elektronik("Smartphone", 2000000, 15); // Diskon 15%
        Pakaian pakaian = new Pakaian("Kaos", 50000, 5); // Diskon 5%

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        System.out.println("Total harga setelah diskon: " + keranjang.hitungTotalHarga());
    }
}
