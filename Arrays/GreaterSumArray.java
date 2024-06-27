package Arrays;

import java.util.Arrays;

public class GreaterSumArray{
    private static int sum(int[] arr,int i, int n){
        int sum = 0;
        for(int k=i; k <= n; k++){
            sum += arr[k];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < arr.length; i++){
            arr[i] = sum(arr,i,arr.length-1);
        }

        System.out.println(Arrays.toString(arr));
    }
}