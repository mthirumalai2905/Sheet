public class MaximumNestingDepthOfParanthesis {
    public int maxDepth(String s) {
        int count = 0;
        int maxNum = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                count++;
                if(maxNum < count){
                    maxNum = count;
                }
            } else if (ch == ')') {
                count--;
            }
        }
        return maxNum;
    }

}
