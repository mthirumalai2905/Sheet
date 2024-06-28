class RatInAMaze {
    static ArrayList<String> result = new ArrayList<>();

    public static void solve(int i, int j, int[][] m, int n, String temp) {
        // Boundary check and check if cell is already visited or is blocked
        if (i < 0 || j < 0 || i >= n || j >= n || m[i][j] == 0) {
            return;
        }

        // If the destination is reached, add the path to the result
        if (i == n - 1 && j == n - 1) {
            result.add(temp);
            return;
        }

        // Mark the cell as visited
        m[i][j] = 0;

        // Move Down
        solve(i + 1, j, m, n, temp + "D");

        // Move Right
        solve(i, j + 1, m, n, temp + "R");

        // Move Up
        solve(i - 1, j, m, n, temp + "U");

        // Move Left
        solve(i, j - 1, m, n, temp + "L");

        // Unmark the cell (backtrack)
        m[i][j] = 1;
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        // Clear the result list for fresh invocation
        result.clear();

        // Initial call to solve function
        solve(0, 0, m, n, "");

        return result;
    }
}
