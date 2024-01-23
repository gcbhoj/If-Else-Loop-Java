package IfElseLoops;
/*Number Classifier:
Write a Java program that classifies a given number into the following categories:
Positive
Negative
Zero
Even
Odd */

import java.util.Scanner;

public class NumberClassifier {
    public static void main (String [] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number to find its classification: ");
        int number = scanner.nextInt();

        if(number > 0 && number % 2 == 0){
            System.out.println(number + " is a Positive and Even Number.");
        }else if(number > 0 && number % 2 != 0){
            System.out.println(+number+" is a Positve and Odd Number.");
        }else if ( number < 0){
            System.out.println(number+ " is a Negative Number.");
        }else{
            System.out.println("number is Zero.");
        }
        scanner.close();

    }

}
