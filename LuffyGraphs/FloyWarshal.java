class Solution {
    public void shortest_distance(int[][] matrix) {
        int V = matrix.length;

        // Initialize distances
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (i != j && matrix[i][j] == -1) {
                    matrix[i][j] = 10000000; // Use a large value to represent infinity
                }
            }
        }

        // Floyd-Warshall algorithm
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (matrix[i][k] != 10000000 && matrix[k][j] != 10000000) {
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    }
                }
            }
        }

        // Replace large values back with -1 for unreachable paths
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (matrix[i][j] == 10000000) {
                    matrix[i][j] = -1; // Restore the unreachable indicator
                }
            }
        }
    }
}
