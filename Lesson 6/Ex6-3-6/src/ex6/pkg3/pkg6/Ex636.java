/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6.pkg3.pkg6;

/**
 *
 * @author Kate
 */
public class Ex636 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr1[] = new int[]{1,2,3,4,5,6,7,8,9};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0;i<arr1.length;i++){ 
            if (arr1[i]%2==0)sum1++;
            else sum2++;}
        System.out.println("the number of even integer is " + sum1);
        System.out.println("The number of odd integer is " + sum2);
    }
    
}
