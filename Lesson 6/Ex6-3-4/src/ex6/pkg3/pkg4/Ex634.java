/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6.pkg3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex634 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myArray[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Write an element  form 1 to 9");
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int a = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (e == myArray[i])
                System.out.println("element's index is " + i);
            
         
        }
    }

}
