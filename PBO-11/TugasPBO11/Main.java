/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO11;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Make author object
        Pengarang author1 = new Pengarang("Fufufafa");
        Pengarang author2 = new Pengarang("Perrell");
        
        // Make book object
        Buku book1 = new Buku("My One Ball President");
        Buku book2 = new Buku("Kisah Laga-Laga");

        // Connecting Book and Author
        BookWithAuthor BNA1 = new BookWithAuthor(book1, author1);
        BookWithAuthor BNA2 = new BookWithAuthor(book2, author2);
        
        // Make Library Object
        Perpustakaan Library = new Perpustakaan(5);
        Library.addBook(book1);
        Library.addBook(book2);
        
        // Displaying Library Information
        Library.infoPerpustakaan();
        
        // Displaying Book with Author Information
        System.out.println("\nInformasi Buku dengan Author: ");
        BNA1.infoBookWithAuthor();
        BNA2.infoBookWithAuthor();
    }
}
