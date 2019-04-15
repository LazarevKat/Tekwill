/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg10.pkg7;

/**
 *
 * @author Kate
 */
public class Ex107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Invoce invoceTest = new Invoce("1","position",12,2.3);
      System.out.println(invoceTest.description);
      System.out.println(invoceTest.number);
      System.out.println(invoceTest.price);
      System.out.println(invoceTest.quantity);
      System.out.println("to pay "+ invoceTest.getInvoceAmount());
    }
    
}
