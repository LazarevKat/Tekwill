/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twointegers;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class TwoIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please input integer X");
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        System.out.println("Please input integer Y");
        //      Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int Sum = X + Y;
        int Diffrence = X - Y;
        int Product = X * Y;
        float Average = (X + Y) / 2;
        float Remainder = X % Y;
        System.out.println("the Sum of X,Y is " + Sum);
        System.out.println("the Diffrence of X,Y is " + Diffrence);
        System.out.println("the Average of X,Y is " + Average);
        System.out.println("the Remainder of the division is " + Remainder);

    }

}
