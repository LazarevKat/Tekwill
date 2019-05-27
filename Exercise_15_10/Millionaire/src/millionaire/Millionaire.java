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
        System.out.println("Who wants to be a millionaire? / Insert your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome " + name + "!");
        System.out.println("You should answer following quetions by typing number of answer: 1,2,3,4");
        System.out.println("If you want to use hint type: 50/50");
        System.out.println("If you want to call a friend type: call");
        System.out.println("If you need a help type: help");
        int score = 0;
        System.out.println(name + " has score: " + score);

        ArrayList<Level1> level1 = new ArrayList<Level1>();
        ArrayList<Level1> level2 = new ArrayList<Level1>();

        Level1 q1 = new Level1();
        q1.question = "q1";
        q1.answ1 = "q1answ1";
        q1.answ2 = "q1answ2";
        q1.answ3 = "q1answ3";
        q1.answ4 = "q1answ4";
        q1.rightansw = "4";
        level1.add(q1);

        Level1 q2 = new Level1();
        q2.question = "q2";
        q2.answ1 = "q2answ1";
        q2.answ2 = "q2answ2";
        q2.answ3 = "q2answ3";
        q2.answ4 = "q2answ4";
        q2.rightansw = "2";
        level1.add(q2);

        Level1 q3 = new Level1();
        q3.question = "q3";
        q3.answ1 = "q3answ1";
        q3.answ2 = "q3answ2";
        q3.answ3 = "q3answ3";
        q3.answ4 = "q3answ4";
        q3.rightansw = "1";
        level1.add(q3);

        Level1 q4 = new Level1();
        q4.question = "q4";
        q4.answ1 = "q4answ1";
        q4.answ2 = "q4answ2";
        q4.answ3 = "q4answ3";
        q4.answ4 = "q4answ4";
        q4.rightansw = "4";
        level1.add(q4);

        Level1 q5 = new Level1();
        q3.question = "q5";
        q5.answ1 = "q5answ1";
        q5.answ2 = "q5answ2";
        q5.answ3 = "q5answ3";
        q5.answ4 = "q5answ4";
        q5.rightansw = "1";
        level1.add(q5);

        Level1 q6 = new Level1();
        q6.question = "q6";
        q6.answ1 = "q6answ1";
        q6.answ2 = "q6answ2";
        q6.answ3 = "q6answ3";
        q6.answ4 = "q6answ4";
        q6.rightansw = "2";
        level1.add(q6);

        Level1 q7 = new Level1();
        q7.question = "q7";
        q7.answ1 = "q7answ1";
        q7.answ2 = "q7answ2";
        q7.answ3 = "q7answ3";
        q7.answ4 = "q7answ4";
        q7.rightansw = "3";
        level1.add(q7);

        Level1 q8 = new Level1();
        q8.question = "q1";
        q8.answ1 = "q1answ1";
        q8.answ2 = "q1answ2";
        q8.answ3 = "q1answ3";
        q8.answ4 = "q1answ4";
        q8.rightansw = "4";
        level2.add(q8);

        Level1 q9 = new Level1();
        q9.question = "q2";
        q9.answ1 = "q2answ1";
        q9.answ2 = "q2answ2";
        q9.answ3 = "q2answ3";
        q9.answ4 = "q2answ4";
        q9.rightansw = "2";
        level2.add(q9);

        Level1 q10 = new Level1();
        q10.question = "q3";
        q10.answ1 = "q3answ1";
        q10.answ2 = "q3answ2";
        q10.answ3 = "q3answ3";
        q10.answ4 = "q3answ4";
        q10.rightansw = "1";
        level2.add(q10);

        Level1 q11 = new Level1();
        q11.question = "q4";
        q11.answ1 = "q4answ1";
        q11.answ2 = "q4answ2";
        q11.answ3 = "q4answ3";
        q11.answ4 = "q4answ4";
        q11.rightansw = "4";
        level2.add(q11);

        Level1 q12 = new Level1();
        q12.question = "q5";
        q12.answ1 = "q5answ1";
        q12.answ2 = "q5answ2";
        q12.answ3 = "q5answ3";
        q12.answ4 = "q5answ4";
        q12.rightansw = "1";
        level2.add(q12);

        Level1 q13 = new Level1();
        q13.question = "q6";
        q13.answ1 = "q6answ1";
        q13.answ2 = "q6answ2";
        q13.answ3 = "q6answ3";
        q13.answ4 = "q6answ4";
        q13.rightansw = "2";
        level2.add(q13);

        Level1 q14 = new Level1();
        q14.question = "q7";
        q14.answ1 = "q7answ1";
        q14.answ2 = "q7answ2";
        q14.answ3 = "q7answ3";
        q14.answ4 = "q7answ4";
        q14.rightansw = "3";
        level2.add(q14);

//        score = getQuetions(level1);
        System.out.println(name + " has score: " + score);
    }

    public static int getQuetions(ArrayList<Level1> questions) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int score = 0;
        if (score == 0);
        {
            Level1 gotquestion = questions.get(random.nextInt(questions.size()));
            System.out.println(gotquestion.question);
            System.out.println(gotquestion.answ1);
            System.out.println(gotquestion.answ2);
            System.out.println(gotquestion.answ3);
            System.out.println(gotquestion.answ4);
            String answer = sc.nextLine();
            if (answer.equals(gotquestion.rightansw)) {
                score = 100;
            } //        if (!answer.equals(questions.get(random.nextInt(questions.size())).rightansw)) {
            else {
                System.out.println("Sorry wrong answer: game over!");
                score = 0;
//            if (answer.equals("50/50") || answer.equals("call") || answer.equals("help"));
//            return score;

            }
        }
    }
}
