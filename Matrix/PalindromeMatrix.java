package Matrix;

import java.util.Arrays;

public class PalindromeMatrix {
    public static void main(String[] args){
       int[][] arr = {
        {1, 0, 0},
        {0, 1, 0},
        {1, 1, 0}
       };
       System.out.println("The First Palindrome is:- "+solve(arr));
       System.out.println(Arrays.toString(arr[0]));
    }
    private static String solve(int[][] arr){
       int n = arr.length;

       for(int i = 0; i < n; i++){
        if(isPalindromeRow(arr[i])){
            return i + " R";
        }
       }

       for(int j = 0; j < n; j++){
        if(isPalindromeColumn(arr, j)){
            return j + " C";
        }
       }

       return "-1";
    }
    private static boolean isPalindromeRow(int[] arr){
       int left = 0;
       int right = arr.length - 1;

       while(left < right){
        if(arr[left] != arr[right]){
            return false;
        }
        left++;
        right--;
       }
       return true;
    }
    private static boolean isPalindromeColumn(int[][] arr, int colIndex){
      int top = 0;
      int bottom = arr.length - 1;

      while(top < bottom){
        if(arr[top][colIndex] != arr[bottom][colIndex]){
            return false;
        }
        top++;
        bottom--;
      }
      return true;
    }
}
