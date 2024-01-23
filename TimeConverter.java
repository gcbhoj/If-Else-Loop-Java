package IfElseLoops;
import java.util.Scanner;
/*Time Converter:
Write a Java program that takes the time in seconds as input and converts it to hours, minutes, and seconds. */

public class TimeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Positive Number : ");
        int timeinSec =  scanner.nextInt();

        int hours = timeinSec/3600;
        int remainingSeconds = timeinSec%3600;
        int minutes = remainingSeconds/60;
        int seconds = minutes%60;

        System.out.println("Converted Time");
        System.out.println("Hours : "+hours);
        System.out.println("Minutes : "+minutes);
        System.out.println("Seconds : "+seconds);

        scanner.close();
        

    }

}
