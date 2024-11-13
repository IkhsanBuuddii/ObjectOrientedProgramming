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
class Klub {
    private String Clubname;
    private List<Anggota> memberList;
    
    public Klub(String Clubname) {
        this.Clubname = Clubname;
        this.memberList = new ArrayList<>();
    }
    
    public void addMember(Anggota member){
        memberList.add(member);
    }
    
    public void infoKlub() {
        System.out.println("Nama Klub: " + Clubname);
        for (Anggota member : memberList) {
            member.infoMember();
        }
    }
}
