package Arrays;

import java.util.HashMap;

public class SubArraysDivisibleByK {
    public static void main(String[] args){
        int[] arr = {4,5,0,-2,-3,1};
        int k = 5;
        int res = subArrayCount(arr,k);
        System.out.println(res);
    }

    public static int subArrayCount(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            int rem = prefixSum % k;
            if(rem < 0){
                rem += k;
            }
            if(map.containsKey(rem)){
                count += map.get(rem);
                map.put(rem,map.get(rem)+1);
            }else{
                map.put(rem,1);
            }
        }

        return count;
    }

}
