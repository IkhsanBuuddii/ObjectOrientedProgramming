/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_4;

/**
 *
 * @author User
 */
// File: Pekerja.java
public class Pekerja extends Manusia {
    private double gaji;

    // Constructor untuk inisialisasi atribut
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter dan Setter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString()
    @Override
    public String toString() {
        return "Nama: " + getNama() + "\n" +
               "Usia: " + usia + "\n" +
               "Pekerjaan: " + pekerjaan + "\n" +
               "Gaji: Rp."+ String.format("%.0f", gaji);
    }
}

