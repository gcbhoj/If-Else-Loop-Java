package IfElseLoops;
import java.util.Scanner;
/*Month Identifier:
Write a program that takes a number (1 to 12) as input and prints the corresponding month name. */

public class MonthIdentifier {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12 to find the Month: ");
        int month = scanner.nextInt();

        if(month < 1 || month > 12){
            System.out.println("Invalid number. \nPlease Enter a number between 1 and 12");
        }else{
            switch (month) {
                case 1:
                    System.out.println("It's January.");
                    break;
                case 2:
                    System.out.println("It's February.");
                    break;
                case 3:
                    System.out.println("It's March.");
                    break;
                case 4:
                    System.out.println("It' April.");
                    break;
                case 5:
                    System.out.println("It's May.");
                    break;
                case 6:
                    System.out.println("It's June.");
                    break;
                case 7:
                    System.out.println("It's July.");
                    break;
                case 8:
                    System.out.println("It's August.");
                    break;
                case 9:
                    System.out.println("It's September.");
                    break;
                case 10:
                    System.out.println("It's October.");
                    break;
                case 11:
                    System.out.println("It's November.");           
                default:
                    System.out.println("It's December.");
                    break;
            }
        }
        scanner.close();

    }

}
