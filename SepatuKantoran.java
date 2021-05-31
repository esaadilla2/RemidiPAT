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
public class SepatuKantoran extends Sepatu {
    private String kategori;
    private double harga;
    
    public SepatuKantoran(String merk, String warna, String jenis,int size, String kategori, double harga){
        super (merk, warna, jenis,size);
        this.kategori=kategori;
        this.harga=harga;
    }
    public void kategoriD(){
        System.out.println("----STRUK BELANJA----");
        super.pilih();
        System.out.println("Kategori sepatu: "+this.kategori);
        System.out.println("Harga sepatu: "+this.harga);
    }
}
