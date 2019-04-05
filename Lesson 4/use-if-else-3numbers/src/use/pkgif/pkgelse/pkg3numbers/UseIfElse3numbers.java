/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package use.pkgif.pkgelse.pkg3numbers;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class UseIfElse3numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Insert x");
        Scanner sc = new Scanner(System.in); 
        float x = sc.nextFloat();
        System.out.println("Insert y");
        float y = sc.nextFloat();
        System.out.println("insert z");
        float z = sc.nextFloat();
        
        if(x>y)
            if (x>z) System.out.println("x is the biggest " + x);
            else
        if (y>z) System.out.println("y is the biggest "+y);
        else System.out.println("z is the biggest "+z);
    }
}