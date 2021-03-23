/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namearray;

/**
 *
 * @author Adinda Ayu Triasasti
 */
public class NameArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] teks = {"Adinda", "Ayu", "Triasasti"};
        
        for (int i=0; i<teks.length; i++) {
            System.out.print(teks [i]);
            System.out.print("  ");
        }
    }
    
}
