package Arrays;
import java.util.Arrays;

public class ReArrangeArrayElements {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] ans = new int[arr.length];
        int even = 0;
        int odd = 1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                ans[even] = arr[i];
                even += 2;
            } else {
                ans[odd] = arr[i];
                odd += 2;
            }
        }

        System.out.print(Arrays.toString(ans));
       
    }
}
