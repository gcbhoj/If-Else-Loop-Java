package IfElseLoops;
/*Discount Applicator:
Build a program that takes the total purchase amount and the customer's membership status as input. 
Apply discounts based on the following conditions:
Gold member: 20% discount
Silver member: 15% discount
Regular member: 10% discount
Non-member: No discount */
import java.util.Scanner;


public class DiscountApplicator {
    public static void main (String [] arg){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the Purchase Amount: ");
        double purchasAmount = scanner.nextDouble();
        
        double discountPercent =0;
        boolean isgoldMember = false;
        boolean issilverMember = false;
        boolean isregularMember = false;
        boolean isnonMember = false;
       

        if(purchasAmount <= 0){
            System.out.println("Invalid Input.\nEnter a Valid Purchase Amount: ");
        }else{
            System.out.println("Enter Customer's Membership type: ");
            String membershipStatus = scanner.next();
            if(membershipStatus.equalsIgnoreCase("Gold")){
                isgoldMember = true;
                discountPercent = .20;
                                
            }else if(membershipStatus.equalsIgnoreCase("Silver")){
                issilverMember =true;
                discountPercent = .15;
               
            }else if(membershipStatus.equalsIgnoreCase("Regular")){
                isregularMember = true;
                discountPercent = .10;
                
            }else{
                isnonMember = true;
                discountPercent = 0;
            }


            double discountAmount = purchasAmount *discountPercent;
            double totalAmount = purchasAmount - discountAmount;

            System.out.println("Purchase Amount: $"+purchasAmount);
            System.out.println("Discount Amount : $"+discountAmount);
            System.out.println("Total Amount: $"+totalAmount);

        }
        scanner.close();
    }

}
