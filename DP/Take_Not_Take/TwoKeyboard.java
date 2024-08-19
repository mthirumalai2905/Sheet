class Solution {
    int[][] t = new int[1001][1001];
    
    private int solve(int currCountA, int pasteCountA, int n) {
        if (currCountA == n) {
            return 0;
        }

        if (currCountA > n) {
            return 1000;
        }

        if (t[currCountA][pasteCountA] != -1) {
            return t[currCountA][pasteCountA];
        }

        int copyPaste = 1 + 1 + solve(currCountA + currCountA, currCountA, n);

        int paste = 1 + solve(currCountA + pasteCountA, pasteCountA, n);

        return t[currCountA][pasteCountA] = Math.min(copyPaste, paste);
    }

    public int minSteps(int n) {
        if (n == 1)
            return 0; // We already have 1 A
        
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = -1;
            }
        }

        // We have to start with a copy, hence 1 + 
        return 1 + solve(1, 1, n);
    }
}
