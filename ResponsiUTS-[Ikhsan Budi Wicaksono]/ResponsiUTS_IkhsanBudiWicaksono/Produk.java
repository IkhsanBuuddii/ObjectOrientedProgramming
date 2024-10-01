/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS_IkhsanBudiWicaksono;

/**
 *
 * @author User
 */
public class Produk {
    private String namaProduk;
    private int harga;
    
    public Produk(String namaProduk, int harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    public void setAtribute(String namaProduk, int harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    public String getAtribute(){
        return "Nama Produk yaitu " + this.namaProduk + ", harga Rp " + this.harga;
    }
    public void tampilInfo(){
        System.out.println(getAtribute());
    }
}
