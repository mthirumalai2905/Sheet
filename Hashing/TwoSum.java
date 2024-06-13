package Hashing;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int[] result = new int[2];
        int target = 14;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(target - arr[i])){
                map.put(arr[i], i);
            }else{
                result[1] = i;
                result[0] = map.get(target - arr[i]);
            }

        }
    }
}
