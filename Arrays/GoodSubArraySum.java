package Arrays;

import java.util.HashMap;

public class GoodSubArraySum {
    public static void main(String[] args) {
        
    }

   
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int remainder = (sum % k + k) % k;

            if(map.containsKey(remainder)){
                if(i - map.get(remainder) > 1){
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }

        return false;
    
}
}
