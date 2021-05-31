/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidipat;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class KasirSepatu {
    
    public static void main(String[] args) {
        
        double harga = 0, diskon, diskon1, total, bayar, kembalian;
        
        Scanner input = new Scanner (System.in);
        System.out.println("----TOKO JAYA BARU----");
        System.out.print("Kasir: ");
        String nama = input.nextLine();
        System.out.print("Tanggal pembelian: ");
        int tanggal = input.nextInt();
        
        System.out.println("Petunjuk Pemilihan Sepatu :");
        System.out.println("Sepatu Olahraga nomor 1 dan 5");
        System.out.println("Sepatu Lari nomor 2");
        System.out.println("Sepatu Santai 3 dan 6");
        System.out.println("Sepatu Kantoran nomor 4");
        
        System.out.print("Masukkan pilihan sepatu: ");
        int pilih = input.nextInt();
        System.out.print("");
        
        switch (pilih){
            case 1:
            SepatuOlahraga SO = new SepatuOlahraga("Fila", "putih", "cowok",34, "Olahraga",700000);
            SO.kategoriA();
            harga=700000;
            break;
            case 2:
            SepatuLari SL = new SepatuLari("Reebok","biru","cewek", 33, "Lari", 300000);
            SL.kategoriB();
            harga=300000;
            break;
            case 3:
            SepatuSantai SS = new SepatuSantai("Converse","hitam", "cewek", 30, "Santai", 300000);
            SS.kategoriC();
            harga=300000;
            break;
            case 4:
            SepatuKantoran SK= new SepatuKantoran("Skechers", "hitam", "cowok", 34, "Kantoran", 600000);
            SK.kategoriD();
            harga=600000;
            break;
            case 5:
            SepatuOlahraga SOlga = new SepatuOlahraga("Nike","merah","cowok",32,"Olahraga",500000);
            SOlga.kategoriA();
            harga=500000;
            break;
            case 6:
            SepatuSantai SSantai = new SepatuSantai("Vans","kuning","cewek",28,"Santai",300000);
            SSantai.kategoriC();
            harga=300000;
            break;
            default:
                break;
        }
        System.out.println("Jumlah pembelian maksimal adalah 3 pasang");
        System.out.print("Jumlah yang dibeli: ");
        int jumlah = input.nextInt();
        System.out.println("");
        
        System.out.println("----PEMBAYARAN----");
        if(jumlah==2){
            diskon=50000;
            total =(harga*jumlah-diskon);
            System.out.println("Total= "+total);
        } else if(jumlah==3){
            diskon1=100000;
            total =(harga*jumlah-diskon1);
            System.out.println("Total= "+total);
        } else{
            total =(harga*jumlah);
            System.out.println("Total= "+total);
        }
        
        System.out.print("Masukkan nominal pembayaran: ");
        bayar = input.nextDouble();
        
        if (bayar == total) {      
            System.out.println("Pembayaran anda telah selesai.");
        } else if (bayar < total){
            System.out.println("Mohon maaf pembayaran gagal. Silahkan cek ulang nominal anda.");
        } else if (bayar > total){
            System.out.println("Selamat pembayaran anda telah selesai. Silakan menunggu untuk kembalian anda.");
            kembalian = bayar - total;
            System.out.println("Kembalian anda : "+ kembalian);
        } else {}
        
        System.out.println("Terima Kasih Sudah Berbelanja di Toko Kami!");
    }
}
