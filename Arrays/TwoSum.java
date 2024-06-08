package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {2,6,5,8,11};
        int target = 14;

        // for(int i = 0; i < arr.length; i++){
        //     for(int j = i+1; j < arr.length; j++){
        //         if(arr[i] + arr[j] == target){
        //             System.out.println(arr[i] + " +  " + arr[j]);
        //         }
        //     }
        // }

    
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }

    
}
