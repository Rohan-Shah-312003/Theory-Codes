package Module_2;


// converting infix expression to prefix using stack.
// two stacks are required.
// operand stack holds operands.
// operator stack holds operators.


import java.util.*;

public class Infix_Prefix {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter an expression: ");
        String exp = ab.nextLine();

        System.out.println("Infix Expression: " + exp);
        System.out.println("Postfix Expression: " + convert(exp));
    }

    static String convert (String exp) {

        LinkedList<Character> stackOd = new LinkedList<>(); // stack for operands (A,B,C,...)
        LinkedList<Character> stackOr = new LinkedList<>(); // stack for operators (+,-,*,/,...)

        int len = exp.length();
        char c;
        String res = "";
        for (int i = 0; i < len; i++) {
            c = exp.charAt(i);

            // checking if it is an operator or an operand.
            if (Character.isLetterOrDigit(c))
                stackOd.push(c);
            else if (stackOr.isEmpty())
                stackOr.push(c);
            // else if (c == '(')
                
        }

        return exp;
    }


    static int precedence (char c) {
        switch (c) {

            case '+':
            case '-':
                return 1;

            case '/':
            case '*':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
}
