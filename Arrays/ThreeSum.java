package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
 public static void main(String[] args) {
    int[] arr = {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> result = findThreeSum(arr);

    for(List<Integer> triplet : result){
        System.out.println(triplet);
    }
 }

 public static List<List<Integer>> findThreeSum(int[] arr){
    HashSet<List<Integer>> set = new HashSet<>();

    for(int i = 0; i < arr.length - 2; i++){
        HashSet<Integer> seen = new HashSet<>();
        for(int j = i + 1; j < arr.length; j++){
            int third = -(arr[i] + arr[j]);
            if(seen.contains(third)){
                List<Integer> triplet = new ArrayList<>();
                triplet.add(arr[i]);
                triplet.add(arr[j]);
                triplet.add(third);
                triplet.sort(Integer::compareTo);
                set.add(triplet);
            } else {
                seen.add(arr[j]);
            }
        }
    }

    return new ArrayList<>(set);
 }
}
