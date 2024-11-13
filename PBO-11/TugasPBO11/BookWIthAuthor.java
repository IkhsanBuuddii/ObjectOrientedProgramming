/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO11;

/**
 *
 * @author User
 */
class BookWithAuthor {
    private Buku book;
    private Pengarang author;
    
    public BookWithAuthor(Buku book, Pengarang author){
        this.book = book;
        this.author = author;
    }
    
    public void infoBookWithAuthor(){
        book.infoBook();
        author.infoAuthor();
    }
}
