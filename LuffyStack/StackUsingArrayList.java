import java.util.*;
public class Stack{
    public static ArrayList<Integer> list;
    public static int size;

    public Stack(int size){
        list = new ArrayList<Integer>();
        this.size = size;

    }

    public static void push(int val){
        if(list.size() == size){
            System.out.println("Stack is Full");
        } else {
            list.add(val);
        }
    }

    public static int pop(){
        if(list.isEmpty()){
            return -1;
        } else {
            return list.remove(list.size() - 1);
        }
    }

    public static boolean isEmpty(){
        return list.isEmpty();
    }

    public static boolean isFull(){
        return list.size() == size;

    }

    public static void peek(){
      if(list.isEmpty()){
        return -1;
      } else {
        return list.get(list.size() - 1);
      } 
    }


}
