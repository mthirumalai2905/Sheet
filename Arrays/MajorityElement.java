package Arrays;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,23,3,3,3,4,4,5};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int num : map.keySet()){
            if(map.get(num) > n/2){
                System.out.println(num);
            }
        }
    }


    // Moore's Voting Algorithm
    
}
