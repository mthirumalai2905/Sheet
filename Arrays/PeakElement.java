package Arrays;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr =  {1, 2, 1, 3, 5, 6, 4};
        int res = 0;

        for(int i = 1; i < arr.length-1; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                res = i;
                break;
            }
        }

        System.out.println(res);
    }
}
