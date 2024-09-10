import java.util.ArrayList;

public class CustomQueue {
    private ArrayList<Integer> list;
    private int size;

    public CustomQueue(int size) {
        list = new ArrayList<>();
        this.size = size;
    }

    public void enqueue(int val) {
        if (list.size() == size) {
            System.out.println("Queue is Full");
        } else {
            list.add(val);
        }
    }

    public int dequeue() {
        if (list.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            return list.remove(0); 
        }
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.size() == size;
    }

    public int peek() {
        if (!list.isEmpty()) {
            return list.get(0);  
        } else {
            System.out.println("Queue is Empty");
            return -1;
        }
    }
}
