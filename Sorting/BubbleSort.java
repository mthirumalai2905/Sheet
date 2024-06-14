import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,9,6,4,3,7,2,1,5,10};

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
