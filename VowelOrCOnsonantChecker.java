package IfElseLoops;
import java.util.*;
/*Vowel or Consonant Checker:
Write a Java program that takes a single character as input and determines whether it is a vowel or a consonant. */

public class VowelOrCOnsonantChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Alphabet to check: ");
        String alphabet = scanner.nextLine().toLowerCase();

        if(alphabet .equals("a") ||alphabet.equals("e") || alphabet.equals("i") || alphabet.equals("o")|| alphabet.equals("u")){
            System.out.println(alphabet+" is a vowel.");
        }else{
            System.out.println(alphabet+" is a consonant.");
        }

        scanner.close();

        // using for loop

        ArrayList<String> vowels = new ArrayList<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");

        boolean isVowel = false;

        for(int i =0; i< vowels.size(); i++){
            if(alphabet.equals(vowels.get(i))){
                isVowel = true;
                break;
            }
        }

        if(isVowel){
            System.out.println(alphabet+ " is a Vowel.");
        }else{
            System.out.println(alphabet+" is a Consonent.");
        }

        

        
    }



}
