/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_6;

/**
 *
 * @author User
 */
abstract class Produk {
    protected String nama;
    protected int harga;
    
    public Produk(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    public abstract int hitungDiskon();
}
