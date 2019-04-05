/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg6.pkg3;

/**
 *
 * @author Kate
 */
public class Ex63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Array1[] = {1, 3, 5};
        int Array2[][] = {{0, 1, 2}, {1, 2, 3}};
        int Sum1 = 0;
        int Sum2 = 0;
        int a = 1;
        int b = 1;
        float Avarage1 = 0;
        float Avarage2 = 0;
        System.out.print("My array1 is:");
        for (int i = 0; i < Array1.length; i++) {
            System.out.print(Array1[i] + " ");
            Sum1 += Array1[i];
            Avarage1 = Sum1 / a;
            a++;
        }
        System.out.println();
        System.out.println("The sum of of values of array1 is: " + Sum1);
        System.out.println("The avarage value of array1 is: " + Avarage1);
        System.out.print("My array2 is:");
        for (int i = 0; i < Array2.length; i++) {
            System.out.println();
            for (int j = 0; j < Array2[i].length; j++) {
                System.out.print(Array2[i][j]);
                Sum2 += Array2[i][j];
                b++;
            }
            Avarage2 = (float)Sum2 / (b-1);
                 }
        System.out.println();
        System.out.println("The sum of values of array2 is " + Sum2);
        System.out.println(b);
        System.out.println("The avarage value of array2 is: " + Avarage2);
    }

}
