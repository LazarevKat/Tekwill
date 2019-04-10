/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg9.pkg12;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex912 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conversion temp = new Conversion();
        System.out.println("insert temperature in Fahrenheit");
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        System.out.println(f + " Fahrenheit is " + temp.conversionFtoC(f) + " Celsius");
        System.out.println("Insert temperature in Celsius");
        double c = sc.nextDouble();
        System.out.println(c +  " Celsius is " + temp.conversionCtoF(c) + " Fahrenheit");
    }

}
