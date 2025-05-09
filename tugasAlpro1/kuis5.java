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
public class kuis5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan usia nasabah: ");    // Meminta pengguna untuk memasukkan usia nasabah
        int usia = scan.nextInt(); // Membaca usia dari input pengguna
        System.out.print("Masukkan pendapatan bulanan nasabah (dalam Rp): "); // Meminta pengguna untuk memasukkan pendapatan bulanan nasabah
        double pendapatan = scan.nextDouble(); // Membaca pendapatan dari input pengguna
        boolean layakKredit = false; // Variabel untuk menyimpan status kelayakan kredit
       if (usia >= 21 && usia <= 60) { // Memeriksa apakah usia nasabah antara 21 hingga 60 tahun
            if (usia > 50) { // Jika usia nasabah lebih dari 50 tahun
                if (pendapatan >= 10000000) { // Memeriksa apakah pendapatan minimal Rp 10.000.000
                    layakKredit = true; // Nasabah layak mendapatkan kredit
                    System.out.println("Usia nasabah lebih dari 50 tahun dan pendapatan memenuhi syarat."); // Pesan tambahan
                } else {
                    System.out.println("Usia nasabah lebih dari 50 tahun tetapi pendapatan kurang dari Rp 10.000.000."); // Pesan tambahan
                }
            } else { // Jika usia nasabah antara 21 hingga 50 tahun
                if (pendapatan >= 5000000) { // Memeriksa apakah pendapatan minimal Rp 5.000.000
                    layakKredit = true; // Nasabah layak mendapatkan kredit
                    System.out.println("Usia nasabah antara 21 hingga 50 tahun dan pendapatan memenuhi syarat."); // Pesan tambahan
                } else {
                    System.out.println("Usia nasabah antara 21 hingga 50 tahun tetapi pendapatan kurang dari Rp 5.000.000."); // Pesan tambahan
                }
                
            }
        } else {
            System.out.println("Usia nasabah tidak memenuhi syarat (harus antara 21 hingga 60 tahun)."); // Pesan jika usia tidak memenuhi syarat
        }
        if (layakKredit) { // Jika nasabah layak mendapatkan kredit
            System.out.println("Nasabah layak mendapatkan kredit."); // Menampilkan pesan kelayakan kredit
        } else { // Jika nasabah tidak layak mendapatkan kredit
            System.out.println("Nasabah tidak layak mendapatkan kredit."); // Menampilkan pesan ketidaklayakan kredit
        }
            }
        }
            
         
