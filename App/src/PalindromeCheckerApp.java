/*
* @author Developer
* * @version 12.0
* */
import java.util.Scanner;
import java.util.Stack;


public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // Choose strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS – StackStrategy
 * Implements palindrome validation using Stack.
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters with popped values
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}