/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg7.pkg8;

/**
 *
 * @author Kate
 */
public class Triangle {

    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point();

    public void determinateType() {
        double p2p1 = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
        double p3p2 = Math.sqrt(Math.pow((p3.x - p2.x), 2) + Math.pow((p3.y - p2.y), 2));
        double p3p1 = Math.sqrt(Math.pow((p3.x - p1.x), 2) + Math.pow((p3.y - p1.y), 2));
If (p2p1==p3p2) {
        if (p3p2==p3p1 && p2p1==p3p1) System.out.println("The trangle is equilateral");
        if (p3p2==p3p1 || p2p1==p3p1) System.out.println("The trangle is isosceles");
        
        
    }
    }

}
