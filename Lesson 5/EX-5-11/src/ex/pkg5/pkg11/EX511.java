/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg5.pkg11;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class EX511 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a positiv number");
        int x = sc.nextInt();
        float a = 1;
        for (a = 1; a <= x; a++) {
            for (float y = 10; y <= x; y++) {
                if (y / 2 == a) {
                    {
                        System.out.println(y);

                    }
                }
            }
        }
    }

}
