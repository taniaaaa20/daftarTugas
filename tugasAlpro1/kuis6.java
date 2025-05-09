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
public class kuis6 {

    private static boolean isCollinear(double[] p1, double[] p2, double[] p3) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static boolean isBetween(double[] p1, double[] p2, double[] p3) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
Scanner scan = new Scanner(System.in);

   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input titik p1
        System.out.print("Masukkan titik p1 (x1 y1): ");
        double[] p1 = {scanner.nextDouble(), scanner.nextDouble()};

        // Input titik p2
        System.out.print("Masukkan titik p2 (x2 y2): ");
        double[] p2 = {scanner.nextDouble(), scanner.nextDouble()};

        // Input titik p3
        System.out.print("Masukkan titik p3 (x3 y3): ");
        double[] p3 = {scanner.nextDouble(), scanner.nextDouble()};

        // Cek kolinearitas
        if (isCollinear(p1, p2, p3)) {
            // Jika kolinear, cek apakah p3 berada di antara p1 dan p2
            if (isBetween(p1, p2, p3)) {
                System.out.println("Titik p3 berada dalam satu garis dengan p1 dan p2.");
            } else {
                System.out.println("Titik p3 tidak berada dalam satu garis dengan p1 dan p2.");
            }
        } else {
            System.out.println("Titik p3 tidak berada dalam satu garis dengan p1 dan p2.");
        }
        System.out.println("");
      
    }
}


