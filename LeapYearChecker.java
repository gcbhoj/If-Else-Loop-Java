package IfElseLoops;
/*Leap Year Checker:
Write a Java program that checks whether a given year is a leap year. A leap year is either:

Divisible by 4 but not divisible by 100, or
Divisible by 400. */

import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String [] arg){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year to check if it's Leap Year: ");
        int year = scanner.nextInt();

        if(year % 4 == 0 && !(year % 100 == 0 || year % 400 == 0)){
            System.out.println(year+" is a leap year.");
        }else{
            System.out.println(year+" is not a leap year.");
        }
        scanner.close();

    }

}
