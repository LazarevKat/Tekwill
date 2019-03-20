/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintoyears;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class MintoYears {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please input the minutes");
        Scanner sc = new Scanner(System.in);
        float minutes = sc.nextFloat();
        float days = minutes/(24*60);
        float years = minutes/(365*24*60);
        System.out.println(minutes + " is " + days + " days");
        System.out.println(minutes + " is " + years + " years");
    }

}
