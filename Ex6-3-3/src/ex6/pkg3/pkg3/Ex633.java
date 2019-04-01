/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6.pkg3.pkg3;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex633 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myArray[] = new String[]{"a", "b", "c", "d", "e"};
        System.out.println("Write a letter");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("read " + a);
        boolean x = true;
        for (int i = 0; i < myArray.length; i++) {
            if (a.equals(myArray[i])) {
              x = true;
            } else {
                x = false;
            }
        }
        if (x == true) {
            System.out.println("This letter is in array");
        } else {
            System.out.println("This letter is not in array");
        }
        System.out.println(a);
    }

}

