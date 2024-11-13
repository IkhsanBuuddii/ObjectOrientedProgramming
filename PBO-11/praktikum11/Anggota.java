/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author User
 */
class Anggota {
    private String name;
    
    public Anggota(String name) {
        this.name = name;
    }
    
    public void infoMember() {
        System.out.println("Nama Member: " + name);
    }
}