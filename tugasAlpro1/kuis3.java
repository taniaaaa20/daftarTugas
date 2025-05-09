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
public class kuis3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); // membuat objek scanner dari class scanner
        System.out.print("Masukkan saldo rekening: "); // Meminta input saldo rekening
        double saldo = scan.nextDouble(); // Membaca input saldo rekening dari pengguna
        System.out.print("Masukkan jumlah yang ingin ditarik: "); //Meminta input jumlah yang ingin ditarik
        int jumlahPenarikan = scan.nextInt(); // Membaca input jumlah yang ingin ditarikdari pengguna
        if (jumlahPenarikan % 50 == 0 && jumlahPenarikan <= saldo) { // jika penarikan adalah kelipatan 50 maka uang bisa diambil
            System.out.println("Transaksi berhasil. Silakan ambil uang Anda."); // jika teransaksi berhasil
        } else if (jumlahPenarikan % 50 != 0) { // jika penarikan adalah kelipatan 50 maka uang tidak bisa diambil
            System.out.println("Transaksi gagal. Jumlah penarikan harus kelipatan 50."); // jika transaksi gagal
        } else if (jumlahPenarikan > saldo) { // 
            System.out.println("Transaksi gagal. Saldo tidak mencukupi."); // jika transaksi gagal dan saldo tidak mencukupi
        }
      
    
        
    }
    
}
