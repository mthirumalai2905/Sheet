package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,3,4,5,6};
        int[] arr2 = {2,3,3,5,6,6,7};

        ArrayList<Integer> intersection = new ArrayList<>();
        int i = 0;
        int j = 0;

        // Iterate through both arrays simultaneously
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                // If both elements are equal, add it to the intersection
                intersection.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                // Move to the next element in arr1
                i++;
            } else {
                // Move to the next element in arr2
                j++;
            }
        }

        // Convert ArrayList to array
        int[] inter = new int[intersection.size()];
        for (int k = 0; k < intersection.size(); k++) {
            inter[k] = intersection.get(k);
        }

        System.out.println("Intersection of two arrays: " + Arrays.toString(inter));
    }
}
