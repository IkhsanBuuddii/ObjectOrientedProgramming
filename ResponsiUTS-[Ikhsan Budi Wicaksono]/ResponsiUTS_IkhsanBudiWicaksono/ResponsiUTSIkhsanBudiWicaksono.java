/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ResponsiUTS_IkhsanBudiWicaksono;

/**
 *
 * @author User
 */
public class ResponsiUTSIkhsanBudiWicaksono {

    public static void main(String[] args) {
        //Polimorfisme
        //Produk
        Produk produk1 = new Elektronik("MSI Modern C11M", 9000000, 2);
        Produk produk2 = new Makanan("Cimory Yogurt 200ml", 10000, "21-4-2025");
        //Pegawai
        Pegawai pegawai1 = new PegawaiTetap("Nian", 10000000, 2000000);
        Pegawai pegawai2 = new PegawaiKontrak("Aka", 3000000, 2);
        //Menampilkan info
        //Produk
        System.out.println("Output Produk: ");
        produk1.tampilInfo();
        produk2.tampilInfo();
        //Pegawai
        System.out.println("Output Pegawai: ");
        pegawai1.tampilInfo();
        pegawai2.tampilInfo();
    }
    
}