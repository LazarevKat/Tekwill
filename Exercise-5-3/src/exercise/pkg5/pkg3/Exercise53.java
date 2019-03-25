/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg5.pkg3;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Exercise53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Insert a number");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        if (x >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negotive");
        }

        System.out.println("result of quadratic equation x^2+5x+1=0");
        int a = 1;
        int b = 5;
        int c = 1;
        double d = (b * b) - (4 * a * c);
        double sqrd = Math.sqrt(d);
        if (d >= 0) {
            double x1 = (-b + sqrd) / (2 * a);
            double x2 = (-b - sqrd) / (2 * a);
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        } else {
            System.out.println("no result");}

            System.out.println("insert  the length of each side of triangle");
            float l1 = sc.nextFloat();
            float l2 = sc.nextFloat();
            float l3 = sc.nextFloat();
            if (l1 == l2) {
                if (l2 == l3) {
                    System.out.println("the triangle is equilateral");
                } else {
                    System.out.println("the triangle is isosceles");
                }
            } else {
                System.out.println("the triangle is scalene");
            }

        }

    }

