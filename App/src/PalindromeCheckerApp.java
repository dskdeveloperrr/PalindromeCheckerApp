/*
* @author Developer
* * @version 4.0
* */
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // Convert string to char array
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while(start < end) {

            if(chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}