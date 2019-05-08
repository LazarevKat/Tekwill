/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kate
 */
public class EX_15_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point center = new Point(3, 5);
        Point topRightCorner = new Point(-6);
        Point cornerThree = new Point(0, 8);
        Circle mycircle = new Circle(center, 10);
        Rectangle myrect = new Rectangle(topRightCorner, 15, 5);
        Triangle mytriang = new Triangle(center, topRightCorner, cornerThree);

        System.out.println(mycircle.toString());
        mycircle.moveLeft(7);
        System.out.println(mycircle.toString());

        System.out.println(myrect.toString());
        myrect.moveDown(7);
        System.out.println(myrect.toString());

        System.out.println(mytriang.toString());
        mytriang.moveUp(7);
        System.out.println(mytriang.toString());
    }

}
