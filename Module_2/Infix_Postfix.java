package Module_2;

// using stack to convert infix expression to postfix
// stack holds operators and directly prints operands.
import java.util.*;

public class Infix_Postfix {

    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);
        System.out.println("Enter an expression: ");
        String exp = "K+L-M*N+(O^P)*W/U/V*T+Q";   // ab.nextLine();
        System.out.println("Infix: " + exp);
        System.out.println("Postfix: " + convert(exp));
    }

    static String convert(String exp) {

        int len = exp.length();
        char c;
        String result = "";
        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < len; i++) {
            c = exp.charAt(i);

            // condition for printing the alphabets.
            if (Character.isLetterOrDigit(c))
                result += c;

            else if (c == '(')
                stack.push(c);

            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }
                stack.pop();
            }

            // an operator is encountered.
            else {
                while (!stack.isEmpty() && precedence(c) <= (precedence(stack.peek()))) {
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }

            // pop all the operators from the stack.

            while (!stack.isEmpty()) {
                if (stack.peek() == '(')
                    return "Invalid Expression";
                result += stack.peek();
                stack.pop();
            }
        return result;
    }

    static int precedence(char c) {
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
}