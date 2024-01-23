package IfElseLoops;
import java.util.*;
/*Time of Day Greeting:
Write a program that takes the current hour as input and prints a greeting message based on the time of day:
Morning: 5 AM to 11:59 AM
Afternoon: 12 PM to 4:59 PM
Evening: 5 PM to 8:59 PM
Night: 9 PM to 4:59 AM */

public class TimeOfDayGreeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Hour to find the Time of Day: ");
        double hour = scanner.nextInt();

        if(hour >= 5 && hour <= 11.59){
            System.out.println("Its Morning.");
        }else if(hour >= 12 && hour <= 16.59){
            System.err.println("Its Afternoon");
        }else if(hour >= 17 && hour <= 20.59){
            System.out.println("Its Evening.");
        }else if((hour >= 21 && hour <= 24 )||( hour >=0 && hour <= 4.59 )){
            System.out.println("Its Night.");
        }else{
            System.out.println("Invalid hour Entered");
        }

        scanner.close();
    
        
    }

}
