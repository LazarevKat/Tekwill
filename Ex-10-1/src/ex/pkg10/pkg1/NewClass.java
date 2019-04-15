/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg10.pkg1;

/**
 *
 * @author Kate
 */
public class NewClass {
    private static int myvar;
    NewClass(){
        myvar++;
    }
    public void myprint(){
        System.out.println(myvar);
    }
}
