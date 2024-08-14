import java.util.* ;
import java.io.*; 
public class Solution
{

public static int closest3Sum(ArrayList<Integer> arr, int n, int target)
    {
        // Write your code here.
        Collections.sort(arr);

        int closestSum = Integer.MAX_VALUE;

        for(int i = 0; i < n - 2; i++){
            int left = i + 1;
            int right = n - 1;

            while(left < right){
                int currentSum = arr.get(i) + arr.get(left) + arr.get(right);

                if(Math.abs(target - currentSum) < Math.abs(target - closestSum)){
                    closestSum  = currentSum;
                } 

                if(currentSum < target){
                    left++;
                } else if(currentSum > target){
                    right--;
                } else {
                    return currentSum;
                }
            }
        }
                return closestSum;
    }
}
