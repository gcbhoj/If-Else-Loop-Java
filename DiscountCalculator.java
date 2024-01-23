package IfElseLoops;
import java.util.Scanner;
/*Discount Calculator:
Write a Java program that calculates the final price after applying discounts based on the following conditions:
If the purchase amount is greater than $100, apply a 10% discount.
If the purchase amount is greater than $500, apply an additional 5% discount. */

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Amount : ");
        double purchaseAmount = scanner.nextInt();
        double discountPercentage = 0;
        
        if(purchaseAmount > 0){
        if(purchaseAmount > 100 && purchaseAmount <= 500){
            discountPercentage = .10;            
        }else if( purchaseAmount > 500){
            discountPercentage = .15;            
        }
        double discountAmount = purchaseAmount * discountPercentage;
        double finalAmount = purchaseAmount - discountAmount;
        System.out.println("Your Bill Details\n Purchase Amount : $"+purchaseAmount+"\nDiscount : $"+discountAmount+"\n Total: $"+finalAmount);

    }else{
        System.out.println("Please Enter a Valid Amount.");
    }

        scanner.close();
    }

}
