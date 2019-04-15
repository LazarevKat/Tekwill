/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg10.pkg2;

/**
 *
 * @author Kate
 */
public class Student {

    private String name;

    Student() {
        name = "Unknown";
    }
    Student(String newName){
        name = newName;
    }
    public void printName(){
        System.out.println(name);
    }
}
