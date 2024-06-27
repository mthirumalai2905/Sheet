import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        while (!s1.isEmpty()) {
            int t1 = s1.pop();
            s2.push(t1);
        }

        System.out.println("Original Stack:- " + s1);
        System.out.println("Original Stack:- " + s2);
        


    }
}
