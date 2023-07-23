package DSA;
import java.util.*;
public class Java_Stack {

        public static Boolean isBalanced(String s){
            Stack<Character> stack
                    = new Stack<Character>();

            // Traversing the Expression
            for (int i = 0; i < s.length(); i++) {
                char x = s.charAt(i);

                if (x == '(' || x == '[' || x == '{') {
                    // Push the element in the stack
                    stack.push(x);
                    continue;
                }

                // If current character is not opening
                // bracket, then it must be closing. So stack
                // cannot be empty at this point.
                if (stack.isEmpty())
                    return false;
                char check;
                switch (x) {
                    case ')':
                        check = stack.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;

                    case '}':
                        check = stack.pop();
                        if (check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = stack.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }
            }

            // Check Empty Stack
            return (stack.isEmpty());
        }

        public static void main(String []argh)
        {
            Scanner sc = new Scanner(System.in);

            while (sc.hasNext()) {
                String input=sc.next();
                if (isBalanced(input)) System.out.println("true");
                else System.out.println("false");

            }
            sc.close();
        }
    }
