/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author User
 */
public class Kendaraan {
    //Atribut dengan akses modifier berbeda
    private String nama; //Hanya bisa diakses kelas ini
    protected int kecepatanMaks; //Hanya bisa diakses di package yang sama dan subclass
    public String jenisMesin; //Bisa diakses dari mana saja
    
    //Konstruktor
    public Kendaraan (String nama, int kecepatanMaks, String jenisMesin){
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }
    //Getter/Setter Nama
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    //Getter/Setter kecepatanMaks
    public int getkecepatanMaks(){
        return kecepatanMaks;
    }
    public void setkecepatanMaks(int kecepatanMaks){
        this.kecepatanMaks = kecepatanMaks;
    }
    //Getter/Setter Tahun
    public String getjenisMesin(){
        return jenisMesin;
    }
    public void setjenisMesin(String jenisMesin){
        this.jenisMesin = jenisMesin;
    }
}
