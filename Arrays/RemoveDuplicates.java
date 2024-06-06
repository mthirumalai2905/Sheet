package Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,5,6,7,7,8,9,9,9,9};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // for(int num : arr){
        //     if(!set.contains(num)){
        //         set.add(num);
        //     } else {
        //         list.add(num);
        //     }
        // }

        // System.out.println(list);

        for(int num : arr){
            set.add(num);
        }
        System.out.println(set);



        // Optimal Solution
        int[] temp = new int[arr.length];
        int j =0;
        temp[j++] = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                temp[j++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(temp));

        
    }
}
