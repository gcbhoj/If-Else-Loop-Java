package IfElseLoops;
import java.util.Scanner;
/*Password Strength Checker:
Create a program that takes a password as input and checks its strength based on the following criteria:
Weak: Less than 6 characters
Moderate: 6 to 10 characters
Strong: More than 10 characters */

public class PasswordStrengthChecker {
    public static void main (String [] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Password to find its Strength: ");
        String password = scanner.nextLine();
        if(password.length() <= 0){
            System.out.println("Invalid Password.\n Please Enter a Valid Password.");
        }else{
        if(password.length() < 6){
            System.out.println("Your Passowrd is Weak.");
        }else if(password.length() > 6 && password.length() < 10){
            System.out.println("Your Password Strength is Moderate.");
        }else if(password.length() >= 10){
            System.out.println("Yor Password Strength is Strong.");
        }
    }

        scanner.close();


    }

}
