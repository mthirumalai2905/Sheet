package Arrays;

import java.util.HashMap;

public class NumberAppearingOnce {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3,4,4,4,4,4,45,5,6,1,2,3,7,9,8,11};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }

        for(int num : map.keySet()){
            if(map.get(num) == 1){
                System.out.println(num);
            }
        }
    }
}
