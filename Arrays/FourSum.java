package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4, 2, -2};
        int target = 0;
        List<List<Integer>> result = findFourSum(arr, target);
        
        for(List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }

    public static List<List<Integer>> findFourSum(int[] arr, int target) {
        HashSet<List<Integer>> set = new HashSet<>();
        
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 2; j++) {
                HashSet<Integer> seen = new HashSet<>();
                for (int k = j + 1; k < arr.length; k++) {
                    int fourth = target - (arr[i] + arr[j] + arr[k]);
                    if (seen.contains(fourth)) {
                        List<Integer> quadruplet = new ArrayList<>();
                        quadruplet.add(arr[i]);
                        quadruplet.add(arr[j]);
                        quadruplet.add(arr[k]);
                        quadruplet.add(fourth);
                        quadruplet.sort(Integer::compareTo); 
                        set.add(quadruplet);
                    } else {
                        seen.add(arr[k]);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
