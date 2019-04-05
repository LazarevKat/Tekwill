/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg7.pkg8;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Point {

    int x;
    int y;

    public void determinate() {

        if (x > 0 && y > 0) {
            System.out.println("The point is in 1st Quadrant");
        }
        if (x > 0 && y < 0) {
            System.out.println("The point is in 4nd Quadrant");
        }
        if (x < 0 && y < 0) {
            System.out.println("The point is in 3rd Quadrant");
        }
        if (x < 0 && y > 0) {
            System.out.println("The point is in 2rd Quadrant");
        }
    }
}
