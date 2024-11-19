/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO12;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */

public class FileManager {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";

    // Simpan buku ke file teks
    public static void simpanKeFileTeks(Buku buku) throws IOException {
        if (isJudulBukuAda(buku.getJudul())) {
            throw new IllegalArgumentException("Buku dengan judul yang sama sudah ada di file.");
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEXT_FILE, true))) {
            writer.write(buku.toString());
            writer.newLine();
        }
    }

    // Baca buku dari file teks
    public static List<String> bacaDariFileTeks() throws IOException {
        List<String> daftarBuku = new ArrayList<>();
        File file = new File(TEXT_FILE);

        if (!file.exists()) return daftarBuku;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                daftarBuku.add(line);
            }
        }
        return daftarBuku;
    }

    // Simpan objek buku ke file serial
    public static void simpanKeFileSerial(Buku buku) throws IOException {
        List<Buku> daftarBuku = bacaDariFileSerial();
        daftarBuku.add(buku);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(daftarBuku);
        }
    }

    // Baca objek buku dari file serial
    public static List<Buku> bacaDariFileSerial() throws IOException {
        File file = new File(SERIAL_FILE);

        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Buku>) ois.readObject();
        } catch (ClassNotFoundException e) {
            throw new IOException("Error saat membaca objek dari file serial.");
        }
    }

    // Periksa apakah buku dengan judul tertentu ada
    public static boolean isJudulBukuAda(String judul) throws IOException {
        List<String> daftarBuku = bacaDariFileTeks();
        for (String line : daftarBuku) {
            if (line.contains("Judul: " + judul + ",")) {
                return true;
            }
        }
        return false;
    }
}
