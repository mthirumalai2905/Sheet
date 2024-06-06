package Arrays;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11};
        boolean flag = true;

        // for(int i = 0; i < arr.length; i++){
        //     for(int j = i + 1; j < arr.length; j++){
        //         if(arr[i] > arr[j]){
        //             flag = false;
        //         }
        //     }
        // }


        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                flag = false;
            }
        }

        System.out.println(flag);


    }
}
