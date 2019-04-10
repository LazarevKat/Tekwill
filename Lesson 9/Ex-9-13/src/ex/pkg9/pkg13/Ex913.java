/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg9.pkg13;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex913 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Insert a radius of sphere");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println("The volum of sphere with radius " + r + " is " + sphereVolume(r));
        
    }
     public static double sphereVolume(double r){
         return (4/3)*Math.PI*Math.pow(r,3);
     }
}
