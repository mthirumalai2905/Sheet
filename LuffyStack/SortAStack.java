import java.util.*;

class Solution {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(4);
        stack.push(7);
        stack.push(6);

        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            int var = stack.pop();

            while (!temp.isEmpty() && temp.peek() < var) {
                stack.push(temp.pop());
            }

            temp.push(var);
        }

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        System.out.println(stack);

    }
}
