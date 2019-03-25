/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package using.pkgif.pkgelse.statements;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class UsingIfElseStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Insert x");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        
        System.out.println("Insert y");
        float y = sc.nextFloat();
        
        if (x>=y) 
                System.out.println("if-else construct result " + x);
                        else System.out.println("if-else construct result " + y);
        float com = (x>y)?x:y;
        System.out.println("ternary construct result " + com);
            
    }

}
