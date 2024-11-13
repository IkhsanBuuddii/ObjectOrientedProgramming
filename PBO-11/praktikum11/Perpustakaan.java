/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
class Perpustakaan {
    private List<Buku> bookList;
    
    public Perpustakaan() {
        this.bookList = new ArrayList<>();
    }
    
    public void addBook(Buku book) {
        bookList.add(book);
    }
    
    public void infoPerpustakaan() {
        for (Buku book : bookList) {
            book.infoBook();
        }
    }
}
