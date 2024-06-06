package Arrays;

import java.util.Arrays;

public class LeftRotateByDplaces {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6,7};
      int k = 2;
      int[] temp = new int[arr.length];

      for(int i = 0; i < arr.length; i++){
        temp[(i+k)%arr.length] = arr[i];
      }

      System.out.println(Arrays.toString(temp));
   
    }
}
