package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> leaders = findLeaders(arr);
        System.out.println(leaders);
    }

    public static ArrayList<Integer> findLeaders(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int right_max = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > right_max) {
                list.add(arr[i]);
                right_max = arr[i];
            }
        }
        
        // The list will contain leaders in reverse order, so reverse it before returning
        Collections.reverse(list);
        return list;
    }
}
