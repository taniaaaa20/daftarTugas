/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis2;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class kuis4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan total pembelian: "); // Meminta pengguna untuk memasukkan total pembelian
        double totalPembelian = scan.nextDouble(); // Membaca total pembelian dari input pengguna   
        double diskon; // Variabel untuk menyimpan besaran diskon
        double totalHarga; // Variabel untuk menyimpan total harga setelah diskon
        if (totalPembelian > 1000000) { // Jika total pembelian lebih dari Rp 1.000.000
            diskon = totalPembelian * 0.10; // Diskon 10%
        } else if (totalPembelian >= 500000) { // Jika total pembelian antara Rp 500.000 hingga Rp 1.000.000
            diskon = totalPembelian * 0.05; // Diskon 5%
        } else { // Jika total pembelian kurang dari Rp 500.000
            diskon = 0; // Tidak ada diskon
        }
        totalHarga = totalPembelian - diskon; // Menghitung total harga setelah diskon
        // Menampilkan besaran diskon dan total harga yang harus dibayar
        System.out.println("Besaran diskon: Rp " + diskon); // Menampilkan besaran diskon
        System.out.println("Total harga setelah diskon: Rp " + totalHarga); // Menampilkan total harga setelah diskon
      
    }
}
    
