/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO11;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
class Perpustakaan {
    private Buku[] bookList;
    private int NumberOfBook;
    
    public Perpustakaan(int DayaTampung) {
        this.bookList = new Buku[DayaTampung];
        this.NumberOfBook = 0;
    }
    
    public void addBook(Buku book) {
        if (NumberOfBook < bookList.length){
            bookList[NumberOfBook] = book;
            NumberOfBook++;
        } else {
            System.out.println("Sudah Penuh");
        }
    }
    
    public void infoPerpustakaan() {
        System.out.println("Info Library");
        for (int i = 0; i < NumberOfBook; i++) {
            if (bookList[i] != null) {
                bookList[i].infoBook();
            } else {
                System.out.println("Buku pada index " + i + "tidak tersedia.");
            }
        }
    }
}
