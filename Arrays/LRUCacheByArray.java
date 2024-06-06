package Arrays;

import java.util.Arrays;

public class LRUCacheByArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 4;

        int temp = arr[k];
        for(int i = k; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
