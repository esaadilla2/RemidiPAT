/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidipat;

/**
 *
 * @author MOKLET-2
 */
public class Sepatu {
    
    String merk, warna, jenis;
    int size;
    
    public Sepatu(String merk, String warna, String jenis, int size){
        this.merk = merk;
        this.warna = warna;  
        this.jenis = jenis;
        this.size = size;
    }
    
    public void pilih(){
          System.out.println("Masukkan merk sepatu: "+this.merk);
          System.out.println("Pilihan warna: "+this.warna);
          System.out.println("Jenis sepatu: "+this.jenis);
          System.out.println("Ukuran sepatu: "+this.size);
    }
}


