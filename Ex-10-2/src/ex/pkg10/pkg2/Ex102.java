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
public class Ex102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student("Kate");
        Student st3 = new Student("Alex");
        st1.printName();
        st2.printName();
        st3.printName();
//        System.out.println(st1.name);
//        System.out.println(Systest2.name);
//        System.out.println(st3.name);
    }

}
