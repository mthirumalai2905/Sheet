import java.util.Stack;

class Solution {
    public static int getPriority(Character a) {
        if (a == '^') {
            return 3;
        } else if (a == '*' || a == '/') {
            return 2;
        } else if (a == '+' || a == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    public static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        String ans = "";
        
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            
            if (Character.isLetterOrDigit(ch)) {
                ans += ch;
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && getPriority(stack.peek()) >= getPriority(ch)) {
                    ans += stack.pop();
                }
                stack.push(ch);
            }
        }
        
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        
        return ans;
    }

    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(infix));
    }
}
