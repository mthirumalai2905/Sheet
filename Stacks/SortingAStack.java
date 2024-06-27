import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class SortingAStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(4);

        System.out.println("Orignal Stack:- " + stack);

        ArrayList<Integer> list = new ArrayList<>();

        while(!stack.empty()){
            int top = stack.pop();
            list.add(top);
        }

        Collections.sort(list);

        System.out.println(list);

        while(list.size() != 0){
            stack.push(list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }

        System.out.println(stack);
    }
}
