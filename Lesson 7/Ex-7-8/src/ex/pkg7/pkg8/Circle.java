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
public class Circle {
    double radius;
    public void calculateArea(){
        double area = Math.PI*Math.pow(radius,2);
        System.out.println("Area of the cirle is:" + area);
    }
    
}
