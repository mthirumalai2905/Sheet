import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    public ArrayList<String> findPath(int[][] mat) {
        List<String> paths = new ArrayList<>();
        int n = mat.length;
        if (mat[0][0] == 0) {
            return new ArrayList<>();
        }
        findPaths(mat, n, 0, 0, "", paths);
        Collections.sort(paths);
        return new ArrayList<>(paths);
    }

    private static void findPaths(int[][] mat, int n, int i, int j, String pathSoFar, List<String> paths) {
        if (i == n - 1 && j == n - 1) {
            paths.add(pathSoFar);
            return;
        }

        mat[i][j] = 0;

        if (isSafe(mat, n, i + 1, j)) {
            findPaths(mat, n, i + 1, j, pathSoFar + "D", paths);
        }

        if (isSafe(mat, n, i, j + 1)) {
            findPaths(mat, n, i, j + 1, pathSoFar + "R", paths);
        }

        if (isSafe(mat, n, i - 1, j)) {
            findPaths(mat, n, i - 1, j, pathSoFar + "U", paths);
        }

        if (isSafe(mat, n, i, j - 1)) {
            findPaths(mat, n, i, j - 1, pathSoFar + "L", paths);
        }

        mat[i][j] = 1;
    }

    private static boolean isSafe(int[][] mat, int n, int i, int j) {
        return (i >= 0 && i < n && j >= 0 && j < n && mat[i][j] == 1);
    }
}
