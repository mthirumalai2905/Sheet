package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class ElementAppearingnby3times {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3};
        int k = arr.length / 3;

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(int num : map.values()){
            // if(map.get(num) > k){
                list.add(num);
            // }
        }

        System.out.println(list);
    }

    //Optimal (Advanced Boyer Moore's Voting Algorithm)
}
