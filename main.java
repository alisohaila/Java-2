package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi there! welcome to Sohaila Ali's official game:) ");
        System.out.print("Do you want to play? (Yes/No): ");
        String play = input.nextLine();

        if (play.equals("yes") || play.equals("YES") || play.equals("Yes")){
            System.out.println("Okay, let's go!");
        } else if (play.equals("no") || play.equals("NO") || play.equals("No"){
            System.out.println("Alright, bye! ");
            input.close();
        } else {
            System.out.println("Invalid Input");
        }

        int score = 0;
        int num_of_questions = 5;

        while (true) {
            System.out.print("1. Is Python a creature or a programming language? ");
            String question = input.nextLine();

            if (question.equals("programming language") || question.equals("Programming Language") || question.equals("creature") || question.equals("Creature")){
                System.out.println("Correct! It's both actually 1+");
                score += 1;
                break;
            } else {
                System.out.println("Invalid Input");
                continue;
            }
        }

        while (true) {
            System.out.print("2. What is a double in Java, C, C# and C++? (Even Number/Decimal Number): ");
            String question = input.nextLine();

            if (question.equals("decimal number") || question.equals("Decimal Number")){
                System.out.println("Correct! 1+");
                score += 1;
                break;
            } else if (question.equals("even number") || question.equals("Even Number")) {
                System.out.println("Incorrect! It is decimal number");
                break;
            } else {
                System.out.println("Invalid Input");
                continue;
            }
        }

        while (true) {
            System.out.print("3. What is HTML used for? (Game Development/Web Development/Machine Learning): ");
            String question = input.nextLine();

            if (question.equals("web development") || question.equals("Web Development")){
                System.out.println("Correct! 1+");
                score += 1;
                break;
            } else if (question.equals("game development") || question.equals("Game Development") || question.equals("machine learning") || question.equals("Machine Learning")){
                System.out.println("Incorrect! It is Web Development ");
                break;
            } else {
                System.out.println("Invalid Input");
                continue;
            }
        }

        while (true) {
            System.out.print("4. What does OOP stand for? (Out of Print/Object Oriented Programming/Out of Place): ");
            String question = input.nextLine();

            if (question.equals("object oriented programming") || question.equals("Object Oriented Programming")){
                System.out.println("Correct! 1+");
                score += 1;
                break;
            } else if (question.equals("out of print") || question.equals("Out Of Print") || question.equals("out of place") || question.equals("Out Of Place")){
                System.out.println("Incorrect! It is Object Oriented programming");
                break;
            } else {
                System.out.println("Invalid Input");
                continue;
            }
        }

        while (true) {
            System.out.print("5. How do you pronounce C#? (See Hashtag/See Sharp): ");
            String question = input.nextLine();

            if (question.equals("see sharp") || question.equals("See Sharp")){
                System.out.println("Correct! 1+");
                score += 1;
                break;
            } else if (question.equals("see hashtag") || question.equals("See Hashtag")) {
                System.out.println("Incorrect! it is See Sharp");
                break;
            } else {
                System.out.println("Invalid Input");
                continue;

                System.out.println("You've got " + score + '/' + num_of_questions);
            }
        }
    }
}
