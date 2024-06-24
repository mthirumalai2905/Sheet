class Solution {
    //Initialize an ArrayList to store the valid paranthesis generated due recursion tree
    ArrayList<String> result = new ArrayList<>();

    //Main method
    public List<String> generateParenthesis(int n) {
        solve("", 0, 0, n);
        return result;
    }

    //Helper class
    public void solve(String curr, int open, int close, int n) {
        //Base condition
        if (curr.length() == 2 * n) {
            //Checking the validity case
            if (isValid(curr)) {
                result.add(curr);
            }
            return;
        }

        
        if (open < n) {
            solve(curr + "(", open + 1, close, n);
        }
        if (close < open) {
            solve(curr + ")", open, close + 1, n);
        }
    }

    public boolean isValid(String s) {
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> parenthesisCombinations = solution.generateParenthesis(3);
        for (String combination : parenthesisCombinations) {
            System.out.println(combination);
        }
    }
}
