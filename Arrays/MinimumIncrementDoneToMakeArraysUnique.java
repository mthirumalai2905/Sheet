package Arrays;

import java.util.Arrays;

public class MinimumIncrementDoneToMakeArraysUnique {
    public static void main(String[] args) {
        int[] arr = {3,2,1,2,1,7};
        Arrays.sort(arr);
        int res = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] >= arr[i]){
                res += 1 + Math.abs(arr[i] - arr[i-1]);
                arr[i] = arr[i-1] + 1;
            }
        }
        System.out.println("Minimum number of operations required: " + res);
    }
}
