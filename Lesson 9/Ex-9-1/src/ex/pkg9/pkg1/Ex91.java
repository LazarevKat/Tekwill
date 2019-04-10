/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg9.pkg1;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        
        System.out.println(Compare(x));

    }

    public static boolean Compare(double x) {

        if (x > 0) {
            return true;
        }
    //    if (x < 0) {
      //      return false;
        //}
        else return false;
       
    }
}
