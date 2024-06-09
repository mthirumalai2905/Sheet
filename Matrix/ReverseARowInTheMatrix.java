package Matrix;

public class ReverseARowInTheMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };

        //Find the middle row
        int middleRow = matrix.length / 2;

        //Reverse the middle row 
        for(int i = 0;i < matrix[middleRow].length/2; i++)
        {
            int temp  = matrix[middleRow][i];
            matrix[middleRow][i] = matrix[middleRow][matrix[middleRow].length - 1 - i];
            matrix[middleRow][matrix[middleRow].length - 1 - i] = temp;
        }


        System.out.println(matrix[middleRow][matrix[middleRow].length/2]);
        
        //Print the matrix to verify the result
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
