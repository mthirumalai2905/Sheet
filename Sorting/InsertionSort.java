import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,9,7,5,6,3,0,8};
        insertionSort(arr, 6);
        System.out.println("Sorted Array is:"+ Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr, int n){
        n = arr.length;

        for(int i = 1; i < n; i++){
            int j = i - 1;
            int key = arr[i];
            while(j > -1 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
