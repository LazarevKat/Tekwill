/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg5.pkg10;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex510 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a positive number");
        int x = sc.nextInt();
        for (int y = 1; y < x; y++) {
            System.out.println(y);
        }

    }
}
