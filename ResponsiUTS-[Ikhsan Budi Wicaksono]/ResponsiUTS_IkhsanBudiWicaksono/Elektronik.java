/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS_IkhsanBudiWicaksono;

/**
 *
 * @author User
 */
public class Elektronik extends Produk {
    private int garansi;
    
    public Elektronik(String namaProduk, int harga, int garansi){
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    public void setAtribute(String namaProduk, int harga, int garansi){
        super.setAtribute(namaProduk, harga);
        this.garansi = garansi;
    }
    @Override
    public String getAtribute(){
        return super.getAtribute() + " dengan garansi " + garansi + " tahun";
    }
    @Override
    public void tampilInfo(){
        System.out.println(getAtribute());
    }
}    
