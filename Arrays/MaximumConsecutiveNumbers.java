package Arrays;

public class MaximumConsecutiveNumbers {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,1,1,1,1,2,3,4,5,1,1,1,1,1,1,2,3,1,1,1,1,1,1,1,1,2,3,4,5};
        
        int curr = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                curr++;
                if(curr > max){
                    max = curr;
                }
            } else {
                curr = 0;
            }
        }


        System.out.println(max);
    }
}
