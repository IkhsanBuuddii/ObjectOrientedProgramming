/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO10;

/**
 *
 * @author User
 */
public class Elektronik implements Pembayaran {
    @Override
    public double hitungPajak(double harga){
        return 0.1 * harga;
    }
}
