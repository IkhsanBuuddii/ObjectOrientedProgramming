/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_6;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;

class KeranjangBelanja {
    private List<Produk> produkList;
    
    public KeranjangBelanja() {
        produkList = new ArrayList<>();
    }
    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }
    public int hitungTotalHarga() {
        int total = 0;
        for (Produk produk : produkList) {
            total += produk.hitungDiskon();
        }
        return total;
    }
}
