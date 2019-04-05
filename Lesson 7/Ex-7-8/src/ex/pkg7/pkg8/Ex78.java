/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg7.pkg8;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle01 = new Circle();
        Circle circle02 = new Circle();
        System.out.println("Insert radius of circle01");
        Scanner sc = new Scanner(System.in);
        circle01.radius = sc.nextDouble();
        System.out.println("Insert radius of circle02");
        circle02.radius = sc.nextDouble();
        circle01.calculateArea();
        circle02.calculateArea();
        //rectangle
        Rectangle rectangle01 = new Rectangle();
        System.out.println("Insert the length of rectangle");
        rectangle01.length = sc.nextInt();
        System.out.println("Insert the width of rectangle");
        rectangle01.width = sc.nextInt();
        rectangle01.calculateArea();
        rectangle01.calculatePerimeter();
        Shape shape01 = new Shape();
        Circle circle03 = new Circle();
        circle03.radius = 20;
        shape01.circle = circle03;
        Rectangle rectangle02 = new Rectangle();
        rectangle02.length = 10;
        rectangle02.width = 20;
        shape01.rectangle = rectangle02;
        System.out.println(" ");
        shape01.circle.calculateArea();
        shape01.rectangle.calculateArea();
        shape01.rectangle.calculatePerimeter();
        // Ex 7-11
        System.out.println(" ");
        Array myarray = new Array();
        myarray.sum();
        myarray.avarage();
        myarray.even();
        myarray.lenght();
        myarray.odd();
        //ex 7-12
        Point mypoint = new Point();
        System.out.println(" ");
        System.out.println("insert x ");
        mypoint.x = sc.nextInt();
        System.out.println("Insert y ");
        mypoint.y = sc.nextInt();
        mypoint.determinate();
    }

}
