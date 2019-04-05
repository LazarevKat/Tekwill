/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg8.pkg11;

/**
 *
 * @author Kate
 */
public class Counter {

    private static int counter;

    static void count() {
        counter++;
    }

    static void printcounter() {
        System.out.println(counter);
    }
}
