package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,45,65,34,5};
        int[] arr2 = {2,3,4,78,67,55,55,4,5};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            set.add(num);
        }

        int[] union = new int[set.size()];


        int k = 0;
        for(int num : set){
            union[k++] = num;
        }

        System.out.println(Arrays.toString(union));

    }
}
