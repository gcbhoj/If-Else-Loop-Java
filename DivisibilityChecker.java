package IfElseLoops;
/*Divisibility Checker:
Develop a program that takes two numbers as input and checks whether the first number is divisible by the second number. */
import java.util.Scanner;
public class DivisibilityChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Number: ");
        double x = scanner.nextDouble();

        System.out.println("Enter Your Second Number: ");
        double y = scanner.nextDouble();

        if(x == 0 || y == 0){
            System.out.println("Invalid Input.\nPlease enter a valid number.");
        }else{
            if(x % y == 0){
                System.out.println("Your First Number is divisible by Second Number.");
            }else{
                System.out.println("Your First Number is Not divisible by Second Number.");
            }
        }
        scanner.close();
    }

}
