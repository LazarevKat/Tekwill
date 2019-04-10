/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg9.pkg12;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Conversion {
    
    public double conversionFtoC(double f) {

     
        return (5 * (f - 32)) / 9;
    }

    public double conversionCtoF(double c) {
        
       
        return (9 * c + (32 * 5)) / 5;
    }
}
