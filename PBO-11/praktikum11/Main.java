/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author User
 */

public class Main {
    public static void main(String[] args) {
    // Main for Composition
        Perpustakaan Library = new Perpustakaan();
        Buku book1 = new Buku("69 Menit Jago Mew- Ngoding");
        Buku book2 = new Buku("Puncak Algoritma");

        Library.addBook(book1);
        Library.addBook(book2);
        
        Library.infoPerpustakaan();
        System.out.println();
    // Main for Aggregation
        Klub Serikat = new Klub("Serikat Hitam");
        Anggota MemberHitam1 = new Anggota("Fuad");
        Anggota MemberHitam2 = new Anggota("Rusdi");
        
        Serikat.addMember(MemberHitam1);
        Serikat.addMember(MemberHitam2);
        
        Serikat.infoKlub();
    }
}
