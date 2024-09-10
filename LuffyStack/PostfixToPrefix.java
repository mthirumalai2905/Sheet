class Solution {
     static String postToPre(String post_exp) {
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < post_exp.length(); i++) {
            char ch = post_exp.charAt(i);
            
            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            } else {
                String t1 = stack.pop();
                String t2 = stack.pop();
                String res = ch + t2 + t1;
                stack.push(res);
            }
        }
        return stack.pop();
    }
}
