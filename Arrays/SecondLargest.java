package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12,23,45,32,12,45,67,89,192,234,132,124};

        int first_max  = 0;
        int second_max = 0;

        int first_small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < first_small){
                second_small = first_small;
                first_small = arr[i];
            } 
            if(arr[i] < second_small && arr[i] != first_small){
                second_small = arr[i];
            }
        }

        System.out.println(first_small);
        System.out.println(second_small);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > first_max){
                second_max = first_max;
                first_max = arr[i];
            }
            if(arr[i] > second_max && arr[i] != first_max){
                second_max = arr[i];
            }
        }

        System.out.println(first_max);
        System.out.println(second_max);
    }
}
