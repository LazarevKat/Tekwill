/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg5.pkg7;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a day");
        String day = sc.nextLine();
        switch (day) {
            case "MON":
            case "TUE":
                System.out.println("Had no lessons");
                break;
            case "WED":
            case "THU":
                System.out.println("Had lesson on MON,WED");
                break;
            case "FRI":
            case "SAT":
            case "SUN":
                System.out.println("Had lessons on MON,WED,FRI");
                break;
                default: System.out.println("error message");
        }

    }

}
