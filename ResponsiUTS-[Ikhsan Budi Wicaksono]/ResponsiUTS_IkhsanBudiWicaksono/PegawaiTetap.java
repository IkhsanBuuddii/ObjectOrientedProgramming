/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS_IkhsanBudiWicaksono;

/**
 *
 * @author User
 */
public class PegawaiTetap extends Pegawai {
    private int tunjangan;
    
    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan){
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    public void setAtribute(String namaPegawai, int gaji, int tunjangan){
        super.setAtribute(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    @Override
    public String getAtribute(){
        return super.getAtribute() + " dengan tunjangan Rp " + tunjangan;
    }
    @Override
    public void tampilInfo(){
        System.out.println(getAtribute());
    }
}