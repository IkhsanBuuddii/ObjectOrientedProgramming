/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS_IkhsanBudiWicaksono;

/**
 *
 * @author User
 */
public class PegawaiKontrak extends Pegawai {
    private int lamaKontrak;
    
    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak){
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    public void setAtribute(String namaPegawai, int gaji, int lamaKontrak){
        super.setAtribute(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    @Override
    public String getAtribute(){
        return super.getAtribute() + " dengan lama kontrak " + lamaKontrak + " tahun";
    }
    @Override
    public void tampilInfo(){
        System.out.println(getAtribute());
    }
}