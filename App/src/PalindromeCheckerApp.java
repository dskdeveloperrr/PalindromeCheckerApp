/*
* @author Developer
* * @version 3.0
* */
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        String reversed = "";

        // Reverse the string using loop
        for(int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed
        if(input.equals(reversed)) {
            System.out.println("Input text: " + input);
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Input text: " + input);
            System.out.println("Is it a Palindrome? : false");
        }

        sc.close();
    }
}