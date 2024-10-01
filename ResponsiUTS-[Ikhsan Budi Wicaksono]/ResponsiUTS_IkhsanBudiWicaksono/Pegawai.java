/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS_IkhsanBudiWicaksono;

/**
 *
 * @author User
 */
public class Pegawai {
    private String namaPegawai;
    private int gaji;
    
    public Pegawai(String namaPegawai, int gaji){
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    public void setAtribute(String namaPegawai, int gaji){
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    public String getAtribute(){
        return "Nama pegawai yaitu " + this.namaPegawai + " memiliki gaji Rp " + this.gaji;
    } 
    public void tampilInfo(){
        System.out.println(getAtribute());
    }
}
