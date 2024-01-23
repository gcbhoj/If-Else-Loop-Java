package IfElseLoops;
/*Triangle Type Identifier:
Write a Java program that takes three angles as input and identifies the type of triangle based on the angles:

Equilateral: All angles are equal.
Isosceles: Two angles are equal.
Scalene: No angles are equal. */

import java.util.Scanner;

public class TriangleTypeIdentifier {
    public static void main (String [] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Angle : ");
        int x = scanner.nextInt();        
        System.out.print("Enter the Second Angle : ");
        int y = scanner.nextInt();
        System.out.print("Enter the Third Angle : ");        
        int z = scanner.nextInt();
        if(x+y+z == 180){
        if(x == y && y == z){
            System.out.println("Its a Equilateral Triangel.");
        }else if( x == y || y == z || x == z){
            System.out.println("Its a Isosceles Triange");
        }else{
            System.out.println("Its a Scalene Triange.");
        }        
        }else{
            System.out.println("Invalid triangle angles. The sum of angles must be 180 degrees.");

        scanner.close();
        
    }

}
}
