/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS_IkhsanBudiWicaksono;

/**
 *
 * @author User
 */
public class Makanan extends Produk {
    private String tanggalKadaluarsa;
    
    public Makanan(String namaProduk, int harga, String tanggalKadaluarsa){
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    public void setAtribute(String namaProduk, int harga, String tanggalKadaluarsa){
        super.setAtribute(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    @Override
    public String getAtribute(){
        return super.getAtribute()+ " dengan tanggal kadaluarsa sebelum  " + tanggalKadaluarsa;
    }
    @Override
    public void tampilInfo(){
        System.out.println(getAtribute());
    }
}    
