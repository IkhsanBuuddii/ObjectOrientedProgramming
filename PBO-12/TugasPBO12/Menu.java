/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO12;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author User
 */

public class Menu {
    public void tampilkanMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Tampilkan Daftar Buku (Teks)");
            System.out.println("3. Tampilkan Daftar Buku (Serial)");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsum newline

            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> tampilkanDaftarBukuTeks();
                case 3 -> tampilkanDaftarBukuSerial();
                case 4 -> {
                    System.out.println("Keluar dari sistem.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan pengarang buku: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();

        Buku buku = new Buku(judul, pengarang, tahunTerbit);

        try {
            FileManager.simpanKeFileTeks(buku);
            FileManager.simpanKeFileSerial(buku);
            System.out.println("Buku berhasil ditambahkan ke file teks dan serial.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan buku.");
            e.printStackTrace();
        }
    }

    private void tampilkanDaftarBukuTeks() {
        try {
            List<String> daftarBuku = FileManager.bacaDariFileTeks();
            System.out.println("\nDaftar Buku di File Teks:");
            for (int i = 0; i < daftarBuku.size(); i++) {
                System.out.println((i + 1) + ". " + daftarBuku.get(i));
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file teks.");
            e.printStackTrace();
        }
    }

    private void tampilkanDaftarBukuSerial() {
        try {
            List<Buku> daftarBuku = FileManager.bacaDariFileSerial();
            System.out.println("\nDaftar Buku di File Serial:");
            for (int i = 0; i < daftarBuku.size(); i++) {
                System.out.println((i + 1) + ". " + daftarBuku.get(i));
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file serial.");
            e.printStackTrace();
        }
    }
}