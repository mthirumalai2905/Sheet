class Solution {
    private static final Map<Character, String> digitToLetters = new HashMap<>();

    static{
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return result;
        }
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }
    private void backtrack(String digits, int idx, StringBuilder current, List<String> result){
        if(idx == digits.length()){
            result.add(current.toString());
            return;
        }

        char digit = digits.charAt(idx);
        String letters = digitToLetters.get(digit);
        for(char letter : letters.toCharArray()){
            current.append(letter);
            backtrack(digits, idx+1, current, result);
            current.deleteCharAt(current.length() - 1);
        }

    }
}
