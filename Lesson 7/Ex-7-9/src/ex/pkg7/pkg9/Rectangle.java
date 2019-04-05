/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg7.pkg9;

/**
 *
 * @author Kate
 */
public class Rectangle {
    int length;
    int width;
    public void calculateArea(){
        int area = length*width;
        System.out.println("The area of rectangle is: " + area);
    }
    public void calculatePerimeter(){
        int perimeter = 2*length + 2*width;
        System.out.println("The perimeter of rectangle is: " + perimeter);
    }
}
