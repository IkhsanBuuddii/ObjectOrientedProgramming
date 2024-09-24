/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_6;

/**
 *
 * @author User
 */
public class Pakaian extends Produk {
    private int diskon;
    
    public Pakaian(String nama, int harga, int diskon){
        super(nama, harga);
        this.diskon = diskon;
    }
    
    @Override
    public int hitungDiskon() {
        return harga - (harga * diskon / 100);
    }
}