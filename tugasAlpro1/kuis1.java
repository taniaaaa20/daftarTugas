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
public class kuis1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna
        System.out.println("masuan suhu dalam derajat Celsius"); // Meminta input suhu dalam derajat celsius
        double suhu = scan.nextDouble(); //  Membaca input suhu dalam derajat celsius dari pengguna
        // memeriksa pakah suhu beku atau normal
        if(suhu <= 0){ 
            System.out.println("suhu beku"); 
        }else{ // 
                System.out.println("suhu normal"); 
                }
        }
    }
    

