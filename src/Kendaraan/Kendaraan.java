/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kendaraan;
import java.util.Scanner;//library untuk inputan keyboard
/**
 *
 * @author MOKLET-2
 */
public class Kendaraan {
    //Mendefinisikan atribut
    String jenis,brand,warna;
    int cc,keluaran;
    //Method Void Pertama
    void isi(){
        //Untuk mengambil input dari keyboard
        Scanner input = new Scanner(System.in);
        //User memasukkan nilai atribut
        System.out.print("Masukkan Jenis Kendaraannya: ");
        jenis = input.nextLine();
        System.out.print("Masukkan Brand Kendaraannya: ");
        brand = input.nextLine();
        System.out.print("Masukkan Warna Kendaraannya: ");
        warna = input.nextLine();
        System.out.print("Masukkan CC Kendaraannya: ");
        cc = input.nextInt();
        System.out.print("Masukkan Keluaran Kendaraannya: ");
        keluaran = input.nextInt();
    }
    //Method Void Kedua
    void tampil(){
        //Perintah untuk menampilkan output dari method void isi
        System.out.println("");
        System.out.println("Jenis Kendaraan: "+jenis);
        System.out.println("Brand Kendaran: "+brand);
        System.out.println("Warna Kendaraan: "+warna);
        System.out.println("CC Kendaraan: "+cc);
        System.out.println("Keluaran Kendaraan: "+keluaran);
    }
    
}
