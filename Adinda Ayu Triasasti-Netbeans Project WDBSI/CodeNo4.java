/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeno4;

import java.util.Scanner;
/**
 *
 * @Adinda
 */
public class CodeNo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  // Buat scanner 
  
          Scanner s1 = new Scanner (System.in);
          
 // Ambil nilai dari keyboard 
          System.out.print("Masukkan nilai = 10");
          int nilai1 = s1.nextInt();
          System.out.print("Masukkan nilai2 = ");
          int nilai2 = s1.nextInt();
          
 // Hitung dan Print 
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
                 
    }
    
}
