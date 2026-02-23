package stackqueue;
import java.util.*;
public class infixtopostfix {
    public static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPostfix(String expr) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            // If character is an operand, add to output
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If '(' push to stack
            else if (c == '(') {
                stack.push(c);
            }
            // If ')' pop until '(' is found
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Remove '('
            }
            // If operator
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String expr = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Infix:   " + expr);
        System.out.println("Postfix: " + infixToPostfix(expr));
    }
}

