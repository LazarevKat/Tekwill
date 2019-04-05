/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6.pkg3.pkg3.add;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex633Add {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myArray[] = new int[]{10, 20, 30, 40, 5, 6};
        System.out.println("Write a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (a == myArray[i]) {
                System.out.println("present");
                break;
            } else {
                b++;
            }
        }
        if (b==myArray.length)System.out.println("not present");
    }

}
