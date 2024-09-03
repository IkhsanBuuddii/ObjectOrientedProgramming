/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_3;

public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;

    // Constructor
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // Getter dan Setter untuk atribut merk
    public String get(String attribute) {
        switch (attribute.toLowerCase()) {
            case "merk":
                return merk;
            case "model":
                return model;
            case "tahun":
                return String.valueOf(tahun);
            case "warna":
                return warna;
            default:
                return null;
        }
    }

    public void set(String attribute, String value) {
        switch (attribute.toLowerCase()) {
            case "merk":
                this.merk = value;
                break;
            case "model":
                this.model = value;
                break;
            case "tahun":
                this.tahun = Integer.parseInt(value);
                break;
            case "warna":
                this.warna = value;
                break;
        }
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna: " + warna);
    }

    // Method untuk menyalakan mesin
    public void nyalakanMesin() {
        System.out.println("Mesin mobil " + merk + " menyala abangku");
    }
}

