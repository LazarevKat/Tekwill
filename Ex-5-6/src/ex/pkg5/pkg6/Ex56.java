/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg5.pkg6;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number 1-7");
        int d = sc.nextInt();
        switch (d) {
            case 1:
                System.out.println("SUN");
                break;
            case 2:
                System.out.println("MON");
                break;
            case 3:
                System.out.println("TUE");
                break;
            case 4:
                System.out.println("WED");
                break;
            case 5:
                System.out.println("THU");
                break;
            case 6:
                System.out.println("FRI");
                break;
            case 7:
                System.out.println("SAT");
                break;
        }

    }

}
