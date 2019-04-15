/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg10.pkg3;

/**
 *
 * @author Kate
 */
public class Rectangle {
   int length;
   int width;
   public int calculateArea(){
       return length*width;
   }
   Rectangle(){
   }
   Rectangle(int l,int w){
       this.length = l;
       this.width = w;
   }
   Rectangle(int side){
       this.length = side;
       this.width = side;
   }
}
