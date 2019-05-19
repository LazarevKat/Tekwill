/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaire;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class Millionaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Who wants to be a millionaire? \\Insert your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome " + name + "!");
        System.out.println("You should answer following quetions by typing number of answer: 1,2,3,4");
        int score = 0;
        System.out.println(name + " has score: " + score);

        Level1 question = new Level1();
        ArrayList<Level1> level1 = new ArrayList<Level1>();

        Level1 q1 = new Level1();
        q1.question = "q1";
        q1.answ1 = "answ1";
        q1.answ2 = "answ2";
        q1.answ3 = "answ3";
        q1.answ4 = "answ4";
        level1.add(q1);
        q1.rightansw.equals(q1.answ3);

        Level1 q2 = new Level1();
        q2.question = "q2";
        q2.answ1 = "answ1";
        q2.answ2 = "answ2";
        q2.answ3 = "answ3";
        q2.answ4 = "answ4";
        level1.add(q2);
        q2.rightansw.equals(q2.answ2);

        Level1 q3 = new Level1();
        q3.question = "q3";
        q3.answ1 = "answ1";
        q3.answ2 = "answ2";
        q3.answ3 = "answ3";
        q3.answ4 = "answ4";
        level1.add(q3);
        q3.rightansw.equals(q3.answ1);

        Level1 q4 = new Level1();
        q4.question = "q4";
        level1.add(q4);
        q4.answ1 = "answ1";
        q4.answ2 = "answ2";
        q4.answ3 = "answ3";
        q4.answ4 = "answ4";
        q4.rightansw.equals(q4.answ4);

        Level1 q5 = new Level1();
        q3.question = "q5";
        level1.add(q5);
        q5.answ1 = "answ1";
        q5.answ2 = "answ2";
        q5.answ3 = "answ3";
        q5.answ4 = "answ4";
        q5.rightansw.equals(q5.answ1);

        Level1 q6 = new Level1();
        q6.question = "q6";
        level1.add(q6);
        q6.answ1 = "answ1";
        q6.answ2 = "answ2";
        q6.answ3 = "answ3";
        q6.answ4 = "answ4";
        q6.rightansw.equals(q6.answ2);

        Level1 q7 = new Level1();
        q7.question = "q7";
        level1.add(q7);
        q7.answ1 = "answ1";
        q7.answ2 = "answ2";
        q7.answ3 = "answ3";
        q7.answ4 = "answ4";
        q7.rightansw.equals(q7.answ3);

        score = getQuetions(level1);
        System.out.println(name + "has score: " + score);
    }

    public static int getQuetions(ArrayList<Level1> questions) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println(questions.get(random.nextInt(questions.size())).question);
        System.out.println(questions.get(random.nextInt(questions.size())).answ1);
        System.out.println(questions.get(random.nextInt(questions.size())).answ2);
        System.out.println(questions.get(random.nextInt(questions.size())).answ3);
        System.out.println(questions.get(random.nextInt(questions.size())).answ4);
        String answer = sc.nextLine();
//        if (answer.equals(questions.get(random.nextInt(questions.size())).rightansw)) {
            return (score + 100);
//        } else {
//            System.out.println("Sorry wrong answer: game over!");
//            return score;
        }
    }
//}
