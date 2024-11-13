/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO11;

/**
 *
 * @author User
 */
class Buku {
    private String title;
    
    public Buku(String title) {
        this.title = title;
    }
    
    public void infoBook() {
        System.out.println("Judul Buku: " + title);
    }
}
