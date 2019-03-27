/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg5.pkg5;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Ex55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a day: MON,TUE,WED,THU,FRI,SAT,SUN");
        String day = sc.nextLine();
        switch (day) {
            case "MON": System.out.println("MON,WED,FRI");
            break;
            case "TUE": 
            case "WED": System.out.println("WED,FRI");
            break;
            case "THU": 
            case "FRI": System.out.println("FRI");
            break;
            case "SAT":
            case "SUN":System.out.println("NO MORE DAYS");
            break;
            default: System.out.println("error message");
        }
        
    }
    
}
