/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg9.pkg15;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex915 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("input integers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (isMultiple(a, b) == true) {
            System.out.println("The 2nd integer is a multiple of the 1st ");
        } else {
            System.out.println("The 2nd integer is not a multiple of the 1st");
        }
    }

    public static boolean isMultiple(int a, int b) {
        if (a % b == 0) 
            return true;
        else
        return false;
        
    }

}
