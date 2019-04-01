/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6.pkg3.pkg5;

/**
 *
 * @author Kate
 */
public class Ex635 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myArray1[] = new int[]{1,2,3};
        int myArray2[] = new int[3];
        for (int i = 0;i<myArray1.length;i++){
            myArray2[i]=myArray1[i];
        System.out.print(myArray2[i] + " ");
        }
        
    }
    
}
