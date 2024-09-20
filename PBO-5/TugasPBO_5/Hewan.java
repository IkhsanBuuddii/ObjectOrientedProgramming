/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_5;

/**
 *
 * @author User
 */
// Kelas Induk Hewan
// Kelas Induk Hewan
class Hewan {
    String nama;
    String jenis;
    
    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void tampilkanInfo() {
        System.out.println("Nama hewan: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

// Kelas Menengah Mamalia
class Mamalia extends Hewan {
    public Mamalia(String nama) {
        super(nama, "Mamalia"); // Menggunakan konstruktor kelas induk
    }
}

// Kelas Turunan Kucing
class Kucing extends Mamalia {
    public Kucing(String nama) {
        super(nama); // Menggunakan konstruktor kelas menengah
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil metode dari kelas induk
        System.out.println("Suara: Miaw");
    }
}

// Kelas Turunan Anjing
class Anjing extends Mamalia {
    public Anjing(String nama) {
        super(nama); // Menggunakan konstruktor kelas menengah
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil metode dari kelas induk
        System.out.println("Suara: GukGuk");
    }
}


