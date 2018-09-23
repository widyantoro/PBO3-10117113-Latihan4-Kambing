/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan4.kambing;

/*
 * 
 * @author
 * Nama     : Eka Widyantoro
 * Kelas    : IF-3 / PBO3
 * NIM      : 10117113
 * Deskripsi Program : Program untuk mengakses variabel
 */
public class Kambing {

    public void tambahKambing() {
        // Deklarasi variable lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah : " +
                           jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingJantan = new Kambing ();
        kambingJantan.tambahKambing();
    }
    
}
