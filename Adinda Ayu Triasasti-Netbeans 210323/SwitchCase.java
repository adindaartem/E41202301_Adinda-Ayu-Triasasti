/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;
import java.util.Scanner;
/**
 *
 * @author Adinda Ayu Triasasti
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner beliminuman = new Scanner(System.in);
        
        System.out.println("       CAFE CERIA    ");
        System.out.println("       ANEKA MINUMAN ");
        System.out.println("-----------------------------");
        
        // Daftar Minuman
         String[] teks = {"1. Soft drinks", "2. Mix Juices", "3. Nescafe", "4. Soda Milk", "5.Tea"};
         
         for (int i=0; i<teks.length; i++) {
             System.out.println(teks[i]);
             System.out.print("");
         }
       System.out.println("--------------------------------");
       
       
       // Masukkan nama pembeli 
       System.out.print("Masukkan nama pembeli : ");
       String nama = beliminuman.nextLine();
       System.out.println();
       
       // Masukkan menu minuman 
       System.out.print("Silakan masukkan pilihan Anda : "); 
       int minuman = beliminuman.nextInt();
       
       //Switch Case Drink 
       switch (minuman) {
           case 1 :
               System.out.println("Minuman yang Anda pesan adalah Soft Drink");
               break;
           case 2 : 
               System.out.println("Minuman yang Anda pesan adalah Mix Juices");
               break;
           case 3 :
               System.out.println("Minuman yang Anda pesan adalah Nescafe");
               break;
           case 4 :
               System.out.println("Minuman yang Anda pesan adalah Soda Milk");
               break;
           case 5 :
               System.out.println("Minuman yang Anda pesan adalah Tea"); 
               break;
           default : 
               System.out.println("Minuman tidak tersedia");
               
           
               
       }
       System.out.println("Pesanan akan segera kami antar");
       System.out.println("Terima Kasih " + nama + " telah berkunjung ke Cafe Ceria");
    }
    
}
