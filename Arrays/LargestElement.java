package Arrays;

class LargestElement{
    public static void main(String[] args){
       int[] arr = {10,20,43,21,56,76,89,32};

       int max  = Integer.MIN_VALUE;

       for(int i = 0; i < arr.length; i++){
        max = Math.max(max,arr[i]);
       }

       System.out.println(max);
    }
}