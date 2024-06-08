package Arrays;

public class SortOfZeroOneTwo {
    //Dutch National Flag Algorithm
    public static void dnf(int[] arr, int n){
        n = arr.length;
        int low = 0, mid = 0, high = n-1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr[low], arr[mid]);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr[mid],arr[high]);
                high--;
            }
        }
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 2, 1, 2, 2, 0, 0, 1, 1, 0, 1, 0};
        
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Count the number of 0s, 1s, and 2s
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count0++;
            if (arr[i] == 1) count1++;
            if (arr[i] == 2) count2++;
        }

        // Overwrite the array with the sorted order of 0s, 1s, and 2s
        int index = 0;

        // Place all 0s
        for (int i = 0; i < count0; i++) {
            arr[index++] = 0;
        }

        // Place all 1s
        for (int i = 0; i < count1; i++) {
            arr[index++] = 1;
        }

        // Place all 2s
        for (int i = 0; i < count2; i++) {
            arr[index++] = 2;
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
