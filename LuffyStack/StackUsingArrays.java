class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        if(top < arr.length - 1){
            arr[++top] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        if(top > -1){
            return arr[top--];
        } else {
            return -1;
        }
    }
}
