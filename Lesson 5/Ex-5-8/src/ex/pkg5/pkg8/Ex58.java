/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg5.pkg8;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operator: +,-,*,/");
        String oper = sc.nextLine();
        System.out.println("Eneter number 1 and number 2 respectively:");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        switch (oper) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
        }
        if ("+".equals(oper)) {
            System.out.println(num1 + num2);
        }
        if ("-".equals(oper)) {
            System.out.println(num1 - num2);
        }
        if ("*".equals(oper)) {
            System.out.println(num1 * num2);
        }
        if ("/".equals(oper)) {
            System.out.println(num1 / num2);
        }
    }
}
