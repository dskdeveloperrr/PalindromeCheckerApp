/*
* @author Developer
* * @version 7.0
* */
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        // Add characters into deque
        for(char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}