package Matrix;

public class RotateMatrixBy90 {
    public static void main(String[] args){
        int[][] m1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        int[][] m2 = new int[m1.length][m1.length]; // Properly initialize m2 with the same dimensions as m1

        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1.length; j++){
                m2[j][m1.length-1-i] = m1[i][j]; // Fix the index calculation
            }
        }

        // Print the rotated matrix to verify the result
        for(int i = 0; i < m2.length; i++){
            for(int j = 0; j < m2.length; j++){
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
