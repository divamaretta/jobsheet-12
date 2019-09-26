/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet12;

import java.util.Scanner;

/**
 *
 * @author Diva Maretta
 */
public class method2 {
    
    public static double kecepatan(int a, int b) {
        double hasil = a / b;
        return hasil;
        
    }
    public static void main(String[] args) {
        Scanner div = new Scanner(System.in);
        int jarak, waktu;
        System.out.println("Masukkan Jarak : ");
        jarak = div.nextInt();
        System.out.println("Masukkan waktu tempuh : ");
        waktu = div.nextInt();
        double kec = kecepatan(jarak, waktu);
        System.out.println("kecepatan : " + kec + "km/jam");
        
    }
    }
    
    

