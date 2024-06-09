package Matrix;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] originalMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        int[][] transposedMatrix = new int[originalMatrix[0].length][originalMatrix.length];

        for(int i = 0; i < originalMatrix.length; i++){
            for(int j = 0; j < originalMatrix[0].length; j++){
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }

        //Print the original matrix
        System.out.println("Original Matrix");
        for(int i = 0; i < originalMatrix.length; i++){
            for(int j = 0; j < originalMatrix[0].length; j++){
                System.out.print(originalMatrix[i][j] + " ");
            }
            System.out.println();
        }

        //Print the transpose of the matrix
        System.out.println("Transposed Matrix");
        for(int i = 0; i < transposedMatrix.length; i++){
            for(int j = 0; j < transposedMatrix[0].length; j++){
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
