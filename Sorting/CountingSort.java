import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        countingSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void countingSort(int[] arr) {
        
        
        // Count the occurrences of 0s, 1s, and 2s
        int count0 = 0, count1 = 0, count2 = 0;
        for (int num : arr) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }
        
        // Fill the array with 0s, 1s, and 2s based on their counts
        int k = 0;
        for (int i = 0; i < count0; i++) {
            arr[k++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            arr[k++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            arr[k++] = 2;
        }
    }
}
