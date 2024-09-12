class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
       int n = mat.length;
        int[] knowMe = new int[n];
        int[] iKnow = new int[n];
        
        Arrays.fill(knowMe, 0);
        Arrays.fill(iKnow, 0);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    knowMe[j]++;
                    iKnow[i]++;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (iKnow[i] == 0 && knowMe[i] == n - 1) {
                return i;
            }
        }
        
        return -1;
    }
}
