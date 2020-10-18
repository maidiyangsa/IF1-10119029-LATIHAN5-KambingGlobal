/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingglobal;

/**
 *
 * @author Beta Three
 * NAMA     : ADRIAN MAIDIYANGSA
 * KELAS    : IF-1
 * NIM      : 10119029
 */
public class KambingGlobal {

    /**
     * @param args the command line arguments
     */
    int jumlahKambing = 88;
    
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing : " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama kali berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
