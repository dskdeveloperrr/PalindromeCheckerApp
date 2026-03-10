# PalindromeCheckerApp
**UC12 - Strategy Pattern for Palindrome Algorithms**

* The objective of UC12 is to implement palindrome checking using the Strategy Design Pattern.
* The program starts from the main() method.
* The user enters a word using the Scanner class.
* A PalindromeStrategy interface defines the contract for palindrome algorithms.
* Different strategies can implement this interface.
* In this use case, StackStrategy is implemented using a stack.
* The selected strategy is injected at runtime.
* The main program calls the strategy's check() method to validate the palindrome.
* This demonstrates polymorphism and interchangeable algorithms.
* The main class used is PalindromeCheckerApp.