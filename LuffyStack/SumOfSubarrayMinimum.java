class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        List<Integer> NSL = NSL(arr);
        List<Integer> NSR = NSR(arr);
        long sum = 0;
        int mod = (int) 1e9 + 7;  

        for (int i = 0; i < n; i++) {
            int leftCount = i - NSL.get(i);
            int rightCount = NSR.get(i) - i;
            sum = (sum + (long) arr[i] * leftCount * rightCount) % mod;
        }

        return (int) sum;
    }

    public static List<Integer> NSL(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                list.add(stack.peek());
            } else {
                list.add(-1);
            }
            stack.push(i);
        }
        return list;
    }

    public static List<Integer> NSR(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                list.add(stack.peek());
            } else {
                list.add(n);
            }
            stack.push(i);
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }
}
