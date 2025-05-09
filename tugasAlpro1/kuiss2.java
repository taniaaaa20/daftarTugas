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
public class kuiss2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double beratPak1,hargaPak1,beratPak2,hargaPak2; // digunakan untuk mendeklarasikan variabel 
        System.out.println("masukan berat pak1"); //  Meminta input berat pak1
        beratPak1 = scan.nextDouble(); // Membaca input berat pak 1 dari pengguna
        System.out.println("harga pak 1"); // Meminta input harga pak1
        hargaPak1 = scan.nextDouble(); // Membaca input harga pak 1 dari pengguna
        System.out.println("masukan berat pak2"); // Meminta input berat pak2
        beratPak2 = scan.nextDouble(); // Membaca input berat pak 2 dari pengguna
        System.out.println("masukan harga pak2"); // Meminta input masukan harga pak2
        hargaPak2 = scan.nextDouble(); //Membaca input harga dari pak2 dari pengguna
        
        if (hargaPak1 < hargaPak2){ // mencetak apakah harga pak1 lebih murah dari harga pak dua
            System.out.println("pakk pertama lebih murah dari pak kedua"); // output jika harga pak pertama lebih murah
        
        }else{
            System.out.println("kedua pak memiliki harga yang sama"); //output jika kedua pak memiliki harga yang sama
        }
        }
        
    
}
