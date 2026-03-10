/*
* @author Developer
* * @version 8.0
* */
import java.util.Scanner;
import java.util.LinkedList;;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare first and last elements
        while (list.size() > 1) {

            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}