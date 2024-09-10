class Solution {
    static String postToInfix(String exp) {
        int i = 0;
        Stack<String> stack = new Stack<>();
        
        
        while(i < exp.length()){
            char ch = exp.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){
                stack.push(String.valueOf(ch));
            } else {
                String t1 = stack.pop();
                String t2 = stack.pop();
                String res = '(' + t2 + ch + t1 + ')';
                stack.push(res);
            }
            i++;
        }
        return stack.pop();
    }
}
