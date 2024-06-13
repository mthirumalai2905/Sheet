package Arrays;

import java.util.ArrayList;

public class PascalsTriangle {
    public static void main(String[] args) {
        // int[][] triangle = generatePascalsTriangle(4);

        // for(int i = 0; i < triangle.length; i++){
        //     for(int j = 0; j <= i; j++){ // Adjusted to only print valid elements
        //         System.out.print(triangle[i][j] + " ");
        //     }
        //     System.out.println();

        ArrayList<ArrayList<Integer>> list = generatePascalsTriangle(4);

        for(ArrayList<Integer> row : list){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println(list);
    }
    

    // public static int[][] generatePascalsTriangle(int N){
    //     int[][] triangle = new int[N][N];

    //     for(int i = 0; i < N; i++){
    //         triangle[i][0] = 1; // First element of each row is 1
    //         for(int j = 1; j <= i; j++){
    //             triangle[i][j] = triangle[i-1][j-1] + (j < i ? triangle[i-1][j] : 0); 
    //         }
    //     }

    //     return triangle;
    // }

    public static ArrayList<ArrayList<Integer>> generatePascalsTriangle(int N){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < N; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if (j == 0 || j == i) {
                    row.add(1); // First and last element of each row is 1
                } else {
                    row.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(row);
        }

        return list;
    }
    }
