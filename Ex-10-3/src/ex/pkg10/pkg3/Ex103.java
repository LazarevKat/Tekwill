/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg10.pkg3;

/**
 *
 * @author Kate
 */
public class Ex103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle myRec0 = new Rectangle();
        Rectangle myRec1 = new Rectangle(5);
        Rectangle myRec2 = new Rectangle(2, 3);
        System.out.println(myRec0.calculateArea());
        System.out.println(myRec1.calculateArea());
        System.out.println(myRec2.calculateArea());

    }

}
