class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 0, s);
        return result;
    }

    public static void backtrack(List<List<String>> result, List<String> temp, int idx, String s) {
        if (idx >= s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            if (isPalindrome(s, idx, i)) {
                temp.add(s.substring(idx, i + 1)); 
                backtrack(result, temp, i + 1, s);
                temp.remove(temp.size() - 1); 
            }
        }
    }

    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "aab";
        List<List<String>> result = sol.partition(s);
        for (List<String> list : result) {
            System.out.println(list);
        }
    }
}
