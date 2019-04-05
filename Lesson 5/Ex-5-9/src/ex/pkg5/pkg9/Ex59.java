/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg5.pkg9;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert numeral mark 9 to 0");
        int N = sc.nextInt();
        if (N == 9 || N == 10) {
            System.out.println("I'm proud of you!");
        }
        if (N == 8 || N == 7) {
            System.out.println("Very good!");
        }
        if (N == 6) {
            System.out.println("Good.");
        }
        if (N == 5) {
            System.out.println("Approved.");
        }
        if (N < 5) {
            System.out.println("Fail!");
        }
        switch (N) {
            case 10:
            case 9:
                System.out.println("I'm proud of you!");
                break;
            case 8:
            case 7:
                System.out.println("I'm proud of you!");
                break;
            case 6:
                System.out.println("Good.");
                break;
            case 5:
                System.out.println("Approved.");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Fail!");
                break;
        }

    }

}
