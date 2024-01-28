package hackerRankJavaStack;
import java.util.*;

class Solution{
    public static boolean balanced (String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
        }
        return stack.isEmpty(); //returns true
    }

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            char[] charList = new char[input.length()];
            for(int i=0; i<input.length(); i++) {
                charList[i] = input.charAt(i);
            }
            System.out.println(balanced(input));
        }
        sc.close();
    }
}
