package IfElseLoops;
import java.util.*;
/*BMI Calculator:
Create a program that takes a person's weight (in kilograms) and height (in meters) as input and calculates their Body Mass Index (BMI). Classify the BMI into different categories:
Underweight: BMI < 18.5
Normal weight: 18.5 <= BMI < 25
Overweight: 25 <= BMI < 30
Obesity: BMI >= 30 */

public class BMICalculator {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter YOur Weight in Kg: ");
    double weight = scanner.nextInt();
    System.out.println("Enter Your Height in meters: ");
    double height = scanner.nextInt();

    double bodyMassIndex = weight/height;
    if(height == 0 || weight == 0){
        System.out.println("Height and Weight cannot be 0");
    }else{
    if(bodyMassIndex < 18.5){
        System.out.println("You are UnderWeight.");
    }else if(bodyMassIndex >= 18.5 && bodyMassIndex < 25){
        System.out.println("Your Weight is Normal.");
    }else if(bodyMassIndex > 25 && bodyMassIndex <30 ){
        System.out.println("You are Overweight.");
    }else if(bodyMassIndex >= 30){
        System.out.println("You have Obesity");
    }
}

    scanner.close();

   }
}
