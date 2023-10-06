package Module_2;


// converting infix expression to prefix.
import java.util.*;

public class Infix_Prefix {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter an expression: ");
        String exp = ab.nextLine();

        System.out.println("Infix Expression: " + exp);
        System.out.println("Postfix Expression: " + convert(exp));
    }


}
