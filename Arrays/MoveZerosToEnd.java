package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
       int[] arr = {1,0,2,3,2,0,0,4,5,1};
       int[] temp = new int[arr.length];
       int j = 0;

       for(int i = 0; i < arr.length; i++){
        if(arr[i] != 0 && j < arr.length){
            temp[j] = arr[i];
            j++;
        }
       }
       System.out.println(Arrays.toString(temp));

    }
}
