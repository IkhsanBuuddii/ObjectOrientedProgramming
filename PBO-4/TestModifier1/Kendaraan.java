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
    private String merek;
    private String model;
    private int tahun;
    
    //Konstruktor
    public Kendaraan (String merek, String model, int tahun){
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }
    //Getter/Setter Merek
    public String getMerek(){
        return merek;
    }
    public void setMerek(String merek){
        this.merek = merek;
    }
    //Getter/Setter Model
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    //Getter/Setter Tahun
    public int getTahun(){
        return tahun;
    }
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
}
