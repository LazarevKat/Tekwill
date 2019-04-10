/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg9.pkg14;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex914 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Input base and exponent");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int myexp = sc.nextInt();
        System.out.println(base + " exponentiation is " + integerPower(base,myexp));
    }

    public static int integerPower(int base, int myexp) {
        int power = 1;
        if (myexp <= 0) {
            System.out.println("the statement is illegal");

        } else {
//            int a = exponent;

            int i = 1;
//            for (int i = 1, i <exponent,i  ++) {
            while (i <=myexp) {
                power = power * base;
                i++;
            }
        }
        return power;

    }

}
