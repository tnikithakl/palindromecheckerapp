import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        // 1. Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // 2. Pop characters and build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // 3. Compare and print result
        if (input.equals(reversed)) {
            System.out.println("Result: It is a Palindrome ✅");
        } else {
            System.out.println("Result: Not a Palindrome ❌");
        }

        scanner.close();
    }
}
