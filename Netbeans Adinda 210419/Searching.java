/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

/**
 *
 * @author Adinda Ayu Triasasti
 */
public class Searching {
    public static void main(String[] args) {
    int[] exampleVariableOne = {2, 9, 6,7, 4, 5, 3, 0, 1};
    int target = 4;
    searching (exampleVariableOne, target);
    }
public static void searching(int[] parameterOne, int parameterTwo) {
    int index = -1;
    //searches each index of the array untill it reaches the last index
    for (int i=0;  i<parameterOne.length; i++) {
        if (parameterOne[i] == parameterTwo) {
            // if the target is found, int index is set as the value of i and
            // the for loop is terminated
            index = i;
            break;
        }
    }
    if (index == -1) {
        System.out.println("Your target integer does not exist in the array");
    } else {
        System.out.println("Your target integer is in index"  +  index  +  "of the array");
    }
}
    private static void Searching (int[] exampleVariableOne, int target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

