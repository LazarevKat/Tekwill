/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farenheittocelsiusdegree;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class FarenheittoCelsiusDegree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input temperature in Fahrenheit, please");
        float fahrenheit = sc.nextFloat();
        celsius = (5 * (fahrenheit - 32) / 9);
        System.out.println(fahrenheit + "F degrees is " + celsius + "C degrees");
       byte bytes = new Byte(10)
    }

}
