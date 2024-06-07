package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int N = 5;

        int expectedSum = (N*(N+1))/2;
        int actualSum = 0;
        for(int i = 0; i < arr.length; i++){
            actualSum += arr[i];
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);
    }
}
