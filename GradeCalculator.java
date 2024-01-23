package IfElseLoops;
/*Write a Java program that takes a student's score as input and prints the corresponding grade based on the following criteria:

A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
*/

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter Your score to check your Grade : ");        
        int grade = scanner.nextInt();

        if(grade >= 100 && grade <= 100){
            System.out.println("Congraluations! You have received 'A'.");
        }else if(grade >= 80 && grade <= 89){
            System.out.println("Congraluations! You have received 'B'.");
        }else if(grade >= 70 && grade <= 79){
            System.out.println("Good Work !. You have received 'C'.");
        }else if(grade >= 60 && grade <= 69){
            System.out.println("You Need to Work Hard !. You have received 'D'.");
        }else{
            System.out.println("Sorry !. You have a Failing Grade 'F'.");
        }
        scanner.close();
        
    };
}