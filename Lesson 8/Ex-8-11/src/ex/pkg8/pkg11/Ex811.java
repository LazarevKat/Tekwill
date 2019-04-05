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
public class Ex811 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.count();
        c2.count();
        Counter.count();
        Counter.printcounter();
    }
    
}
