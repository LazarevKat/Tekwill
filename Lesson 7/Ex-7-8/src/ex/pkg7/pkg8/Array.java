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
public class Array {

    public int[] items = new int[]{1, 2, 3};
    int sum1 = 0;
    int number1 = 0;
    int number2 = 0;
    double avarage = 0;

    public void sum() {
        for (int i = 0; i < items.length; i++) {
            sum1 = sum1 + items[i];
        }
        System.out.println("the sum of array is: " + sum1);
    }

    public void avarage() {
        for (int i = 0; i < items.length; i++) {
            avarage = sum1 / items.length;
        }
        System.out.println("the avarage of array is " + avarage);

    }

    public void even() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 == 0) {
                number1++;
            }
        }
        System.out.println("The number of even elements is " + number1);
    }

    public void odd() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 != 0) {
                number2++;
            }
        }
        System.out.println("The number of odd elements is " + number2);
    }
    
    public void lenght(){
        System.out.println("The length of array is " + items.length);
    }
}
