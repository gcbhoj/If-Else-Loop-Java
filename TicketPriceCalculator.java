package IfElseLoops;
/*Ticket Price Calculator:
Develop a program that takes a person's age and the type of movie ticket as input. Calculate the ticket price based on the following conditions:
Child (age < 12): $5
Adult (age >= 12 and age < 65): $10
Senior (age >= 65): $7 */

import java.util.Scanner;

public class TicketPriceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Yor Age for Ticket Price: ");
        int age = scanner.nextInt();

        if (age <= 0){
            System.out.println("Invalid Age !. Please Enter a Valid Age.");
        }else{
            if(age < 12){
                System.out.println(" For Kids Under 12 Price : $5 ");
            }else if(age >=12 && age <65){
                System.out.println("For Individulas between 12 jto 64 Price : $12");
            }else {
                System.out.println("For Seniors Price : $7");
            }                    
        }

        scanner.close();


        
    }

}
