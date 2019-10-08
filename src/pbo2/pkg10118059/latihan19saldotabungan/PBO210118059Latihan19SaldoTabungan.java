/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan19saldotabungan;


/**
 *
 * @author 
 * Nama  : Muhammad Rakha Firdaus
 * NIM   : 10118059
 * Kelas : IF-2
 */
public class PBO210118059Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal = 2500000;
        for (int i = 1; i <= 6; i++){
            saldoAwal = saldoAwal + (int)(saldoAwal*0.15);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldoAwal);
        }
    }
    
}
