class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> currentList, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = start + 1; i <= s.length(); i++) {
            if (isPalindrome(s, start, i - 1)) {
                currentList.add(s.substring(start, i));
                backtrack(s, i, currentList, result);
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "aab";
        List<List<String>> result = solution.partition(s);
        System.out.println(result);
    }
}
