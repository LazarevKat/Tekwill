/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg11.pkg4;

/**
 *
 * @author Kate
 */
public class Ex114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("def");
        System.out.println(sb1.append(sb2));
        StringBuilder sb3 = new StringBuilder("welcome");
        for (int i = 0; i < 14; i = i + 2) {
            sb3 = sb3.insert(i, sb3.charAt(i));
        }
        System.out.println(sb3);
        StringBuilder sb4 = new StringBuilder("bye-bye");
        StringBuilder sb5 = new StringBuilder();
        for (int i = 0; i < sb4.length(); i++) {
            sb5.append(sb4.charAt(i));
            sb5.append(sb4.charAt(i));
        }
        System.out.println(sb5);
        String str1 = "moon#night";
        String str2 = "bat##ball";
        System.out.println("moon#night");
        checkTheSame(str1);
        System.out.println("bat##ball");
        checkTheSame(str2);
        System.out.println("moon###night");
        String str3 = "moon###night";
        checkTheSame(str3);

    }

    public static void checkTheSame(String str) {

        int i = str.indexOf('#');
        int befor = i - 1;
        int after = i + 1;
        for (int j = after + 1; j < str.length(); j++) {
            if (str.charAt(after) != '#') {
                if (str.charAt(befor) == str.charAt(after)) {
                    System.out.println("Befor and after character is the same: true");break;
                } else {
                    System.out.println("Befor and after character is the same: false");break;
                }
            } else {
                after = j;
            }
        }
    }
}
