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
        ArrayList<Level1> level3 = new ArrayList<Level1>();
        ArrayList<Level1> level4 = new ArrayList<Level1>();
        ArrayList<Level1> level5 = new ArrayList<Level1>();

//Level1        
        Level1 q1 = new Level1();
        q1.question = "q1";
        q1.answ1 = "1.q1answ1";
        q1.answ2 = "2.q1answ2";
        q1.answ3 = "3.q1answ3";
        q1.answ4 = "4.q1answ4";
        q1.rightansw = "4";
        level1.add(q1);

        Level1 q2 = new Level1();
        q2.question = "q2";
        q2.answ1 = "1.q2answ1";
        q2.answ2 = "2.q2answ2";
        q2.answ3 = "3.q2answ3";
        q2.answ4 = "4.q2answ4";
        q2.rightansw = "2";
        level1.add(q2);

        Level1 q3 = new Level1();
        q3.question = "q3";
        q3.answ1 = "1.q3answ1";
        q3.answ2 = "2.q3answ2";
        q3.answ3 = "3.q3answ3";
        q3.answ4 = "4.q3answ4";
        q3.rightansw = "1";
        level1.add(q3);

        Level1 q4 = new Level1();
        q4.question = "q4";
        q4.answ1 = "1.q4answ1";
        q4.answ2 = "2.q4answ2";
        q4.answ3 = "3.q4answ3";
        q4.answ4 = "4.q4answ4";
        q4.rightansw = "4";
        level1.add(q4);

        Level1 q5 = new Level1();
        q5.question = "q5";
        q5.answ1 = "1.q5answ1";
        q5.answ2 = "2.q5answ2";
        q5.answ3 = "3.q5answ3";
        q5.answ4 = "4.q5answ4";
        q5.rightansw = "1";
        level1.add(q5);

//        Level 2
        Level1 q6 = new Level1();
        q6.question = "q6";
        q6.answ1 = "1.q6answ1";
        q6.answ2 = "2.q6answ2";
        q6.answ3 = "3.q6answ3";
        q6.answ4 = "4.q6answ4";
        q6.rightansw = "2";
        level2.add(q6);

        Level1 q7 = new Level1();
        q7.question = "q7";
        q7.answ1 = "1.q7answ1";
        q7.answ2 = "2.q7answ2";
        q7.answ3 = "3.q7answ3";
        q7.answ4 = "4.q7answ4";
        q7.rightansw = "3";
        level2.add(q7);

        Level1 q8 = new Level1();
        q8.question = "q8";
        q8.answ1 = "1.q8answ1";
        q8.answ2 = "2.q8answ2";
        q8.answ3 = "3.q8answ3";
        q8.answ4 = "4.q8answ4";
        q8.rightansw = "4";
        level2.add(q8);

        Level1 q9 = new Level1();
        q9.question = "q9";
        q9.answ1 = "1.q9answ1";
        q9.answ2 = "2.q9answ2";
        q9.answ3 = "3.q9answ3";
        q9.answ4 = "4.q9answ4";
        q9.rightansw = "2";
        level2.add(q9);

//        Level 3
        Level1 q10 = new Level1();
        q10.question = "q10";
        q10.answ1 = "1.q10answ1";
        q10.answ2 = "2.q10answ2";
        q10.answ3 = "3.q10answ3";
        q10.answ4 = "4.q10answ4";
        q10.rightansw = "1";
        level3.add(q10);

        Level1 q11 = new Level1();
        q11.question = "q11";
        q11.answ1 = "1.q11answ1";
        q11.answ2 = "2.q11answ2";
        q11.answ3 = "3.q11answ3";
        q11.answ4 = "4.q11answ4";
        q11.rightansw = "4";
        level3.add(q11);

        Level1 q12 = new Level1();
        q12.question = "q12";
        q12.answ1 = "1.q12answ1";
        q12.answ2 = "2.q12answ2";
        q12.answ3 = "3.q12answ3";
        q12.answ4 = "4.q12answ4";
        q12.rightansw = "1";
        level3.add(q12);

        Level1 q13 = new Level1();
        q13.question = "q13";
        q13.answ1 = "1.q13answ1";
        q13.answ2 = "2.q13answ2";
        q13.answ3 = "3.q13answ3";
        q13.answ4 = "4.q13answ4";
        q13.rightansw = "2";
        level3.add(q13);

        Level1 q14 = new Level1();
        q14.question = "q14";
        q14.answ1 = "1.q14answ1";
        q14.answ2 = "2.q14answ2";
        q14.answ3 = "3.q14answ3";
        q14.answ4 = "4.q14answ4";
        q14.rightansw = "3";
        level3.add(q14);

//        Level 4     
        Level1 q15 = new Level1();
        q15.question = "q15";
        q15.answ1 = "1.q15answ1";
        q15.answ2 = "2.q15answ2";
        q15.answ3 = "3.q15answ3";
        q15.answ4 = "4.q15answ4";
        q15.rightansw = "4";
        level4.add(q15);

        Level1 q16 = new Level1();
        q16.question = "q16";
        q16.answ1 = "1.q16answ1";
        q16.answ2 = "2.q16answ2";
        q16.answ3 = "3.q16answ3";
        q16.answ4 = "4.q16answ4";
        q16.rightansw = "2";
        level4.add(q16);

        Level1 q17 = new Level1();
        q17.question = "q17";
        q17.answ1 = "1.q17answ1";
        q17.answ2 = "2.q17answ2";
        q17.answ3 = "3.q17answ3";
        q17.answ4 = "4.q17answ4";
        q17.rightansw = "1";
        level4.add(q17);

        Level1 q18 = new Level1();
        q18.question = "q18";
        q18.answ1 = "1.q1answ1";
        q18.answ2 = "2.q18answ2";
        q18.answ3 = "3.q18answ3";
        q18.answ4 = "4.q18answ4";
        q18.rightansw = "4";
        level4.add(q18);

        Level1 q19 = new Level1();
        q19.question = "q19";
        q19.answ1 = "1.q19answ1";
        q19.answ2 = "2.q19answ2";
        q19.answ3 = "3.q19answ3";
        q19.answ4 = "4.q19answ4";
        q19.rightansw = "1";
        level4.add(q19);

        Level1 q20 = new Level1();
        q20.question = "q20";
        q20.answ1 = "1.q20answ1";
        q20.answ2 = "2.q20answ2";
        q20.answ3 = "3.q20answ3";
        q20.answ4 = "4.q20answ4";
        q20.rightansw = "1";
        level4.add(q20);

//        Level 5
        Level1 q21 = new Level1();
        q21.question = "q21";
        q21.answ1 = "1.q21answ1";
        q21.answ2 = "2.q21answ2";
        q21.answ3 = "3.q21answ3";
        q21.answ4 = "4.q21answ4";
        q21.rightansw = "1";
        level5.add(q21);

        Level1 q22 = new Level1();
        q22.question = "q22";
        q22.answ1 = "1.q22answ1";
        q22.answ2 = "2.q22answ2";
        q22.answ3 = "3.q22answ3";
        q22.answ4 = "4.q22answ4";
        q22.rightansw = "1";
        level5.add(q22);

        Level1 q23 = new Level1();
        q23.question = "q23";
        q23.answ1 = "1.q23answ1";
        q23.answ2 = "2.q23answ2";
        q23.answ3 = "3.q23answ3";
        q23.answ4 = "4.q23answ4";
        q23.rightansw = "1";
        level5.add(q23);

        Level1 q24 = new Level1();
        q24.question = "q24";
        q24.answ1 = "1.q24answ1";
        q24.answ2 = "2.q24answ2";
        q24.answ3 = "3.q24answ3";
        q24.answ4 = "4.q24answ4";
        q24.rightansw = "1";
        level5.add(q24);

        Level1 q25 = new Level1();
        q25.question = "q25";
        q25.answ1 = "1.q25answ1";
        q25.answ2 = "2.q25answ2";
        q25.answ3 = "3.q25answ3";
        q25.answ4 = "4.q25answ4";
        q25.rightansw = "1";
        level5.add(q25);

        if (score == 0) {
            score = getQuetions(level1, score);
            System.out.println(name + " has score: " + score);
        }
        if (score == 50) {
            score = getQuetions(level2, score);
            System.out.println(name + " has score: " + score);
        }
        if (score == 150) {
            score = getQuetions(level3, score);
            System.out.println(name + " has score: " + score);
        }
        if (score == 300) {
            score = getQuetions(level4, score);
            System.out.println(name + " has score: " + score);
        }
        if (score == 500) {
            score = getQuetions(level5, score);
            System.out.println(name + " has score: " + score);
            System.out.println("Congratulations!!! You are a millionaire!!!");
            System.out.println("Do you want to play again?");
        }
    }

    public static int getQuetions(ArrayList<Level1> questions, int score) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        Level1 gotquestion = questions.get(random.nextInt(questions.size()));
        System.out.println(gotquestion.question);
        System.out.println(gotquestion.answ1);
        System.out.println(gotquestion.answ2);
        System.out.println(gotquestion.answ3);
        System.out.println(gotquestion.answ4);
        String answer = sc.nextLine();

        if (answer.equals("50/50")) {
            System.out.println("Ok! Try again!");
            if (gotquestion.rightansw.equals(gotquestion.answ1.charAt(0))
                    || (gotquestion.rightansw.equals(gotquestion.answ2.charAt(0)))) {
                System.out.println(gotquestion.answ1);
                System.out.println(gotquestion.answ2);
            }
            if (gotquestion.rightansw.equals(gotquestion.answ3.charAt(0))
                    || (gotquestion.rightansw.equals(gotquestion.answ4.charAt(0)))) {
                System.out.println(gotquestion.answ3);
                System.out.println(gotquestion.answ4);
            }
            answer = sc.nextLine();

        }

        if (answer.equals("call")) {
            System.out.println("Your friend thinks right number is " + gotquestion.rightansw);
            answer = sc.nextLine();
        }

        if (answer.equals("help")) {
            if (gotquestion.rightansw.equals(gotquestion.answ1.charAt(0))) {
                System.out.println("1-55%");
                System.out.println("2-25%");
                System.out.println("3-13%");
                System.out.println("4-7%");
            }
            answer = sc.nextLine();
        }

        if (answer.equals(gotquestion.rightansw)) {
            System.out.println("Great! Right answer!");

            if (score == 500) {
                score += 500;
            }
            if (score == 300) {
                score += 200;
            }
            if (score == 150) {
                score += 150;
            }
            if (score == 50) {
                score += 100;
            }
            if (score == 0) {
                score += 50;
            }

        } else {
            System.out.println("Sorry wrong answer: game over!");
            score = 0;
            System.out.println("Do you want to play again?");
        }
        return score;
    }
}
