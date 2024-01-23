package IfElseLoops;

import java.util.Scanner;

/*Nested Conditions with Logical Operators:
Write a Java program that takes two numbers as input and determines whether 
they are both positive,
 both negative, or one positive and one negative. */
public class NestedConditons {
    public static void main (String [] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int x = scanner.nextInt();

        System.out.println("Enter a Second Number: ");
        int y = scanner.nextInt();

        if(x > 0 && y > 0){
            System.out.println(" Both Numbers are Positive.");
        }else if(x < 0 && y < 0){
            System.out.println("Both Numbers are Negative.");
        }else if(x < 0 && y > 0){
            System.out.println("The First Number is Negative and Second Number is Positive.");
        }else if(x > 0 && y < 0){
            System.out.println("The First Number is Positive and the Second Number is Negative.");
        }

        scanner.close();
    }

}
