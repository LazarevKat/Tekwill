/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg5.pkg12;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex512 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert numbers");
        int x = 1;
        int Sum = 0;
        int Num = 0;
        while (x > 0) {
            x = sc.nextInt();
            Sum = Sum + x;
            Num++;
        }
        System.out.println("The sum = " + Sum);
        System.out.println("the amount of entered numbers are " + Num);
    }

}
