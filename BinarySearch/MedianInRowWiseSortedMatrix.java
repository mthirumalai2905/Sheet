public class MedianInRowWiseSortedMatrix {
   public int findMedian(int[][] matrix){
    int rows = matrix.length;
    int cols = matrix[0].length;

    int low = matrix[0][0];
    int high = matrix[rows - 1][cols - 1];

    while(low < high){
        int mid = (low + high)/2;
        int count = 0;

        for(int i = 0; i < rows ; i++){
            count += countLessEqual(matrix[i], mid);
        }

        if(count < (rows * cols + 1) / 2){
            low = mid + 1;
        } else {
            high = mid;
        }
    }
    return low;
   }

   private int countLessEqual(int[] row, int val){
    int low = 0;
    int high = row.length;

    while(low < high){
        int mid = (low + high) / 2;
        if(row[mid] <= val){
            low = mid + 1;
        } else {
            high = mid;
        }
    }
    return low;
   }
}
