package IfElseLoops;
import java.util.*;;
/*Grading System:
Develop a program that takes a student's marks in two subjects as input and prints their grade based on the following conditions:
A: Average marks >= 90
B: 80 <= Average marks < 90
C: 70 <= Average marks < 80
D: 60 <= Average marks < 70
F: Average marks < 60 */

public class GradingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Science Marks: ");
        int scienceMark = scanner.nextInt();
        System.out.println("Enter Your Math Marks: ");
        int mathMark = scanner.nextInt();
        System.out.println("Enter Your Computer Marks: ");
        int computerMark = scanner.nextInt();

        

        if(scienceMark < 0 || mathMark < 0 || computerMark < 0){
            System.out.println(" Marks Cannot be less than 0");            
        }else{
            int averageMarks = (scienceMark+mathMark+computerMark)/3;
            if(averageMarks >= 90){
                System.out.println("You have achieved A.");
            }else if (averageMarks >=80 && averageMarks <= 89){
                System.out.println("You have achieved B");
            }else if(averageMarks >= 70 && averageMarks <= 79){
                System.out.println("You have received C");
            }else if(averageMarks >= 60 && averageMarks <= 69){
                System.out.println("You have received D ");
            }else{
                System.out.println(" Your Grade is F");
            }

        }
            
        
        scanner.close();
        
    }

}
