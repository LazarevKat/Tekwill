/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg9.pkg16;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex916 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("input value for a side");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        squareOfAstericks(n);
    }

    public static void squareOfAstericks(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }

}
