package IfElseLoops;
/*Age Group Classifier:
Write a Java program that takes a person's age as input and classifies them into different age groups:

Infant: 0-2 years
Child: 3-12 years
Teenager: 13-19 years
Adult: 20 years and above */

import java.util.Scanner;

public class AgeGroupClassifier {
    public static void main (String [] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter Your Age to find the Age Group: ");
        int age = scanner.nextInt();
        if(age >= 0){
        if(age >= 0 && age <= 2){
            System.out.println("You are an Infant.");
        }else if(age >= 3 && age <= 12){
            System.out.println("You are a Child.");
        }else if(age >= 13 && age <= 19){
            System.out.println("Hurray!. You are a Teenager.");
        }else{
            System.out.println("You are an Adult.");
        }
    }else{
        System.out.println("Please Enter a Vaild Age: ");
    }
    scanner.close();
    }

}
