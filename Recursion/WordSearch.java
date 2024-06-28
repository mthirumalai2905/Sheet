package Recursion;

public class WordSearch {
    public static void main(String[] args){
        char board[][] = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'},
        };
        String word = "ABCCED";
        System.out.println("The Board contains the required word:- " + exist(board,word));
    }
    private static boolean exist(char[][] board, String word){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(dfs(board,word,i,j,0))
                   return true;
            }
        }
        return false;
    }
    private static boolean dfs(char[][] board, String word, int i, int j, int idx){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(idx)){
            return false;
        }
        if(idx == word.length() - 1)
           return true;

        char temp = board[i][j];
        board[i][j] = '$';

        boolean res = dfs(board, word, i + 1, j,idx+1) || dfs(board,word,i-1,j,idx+1) || dfs(board, word, i, j + 1, idx + 1) || dfs(board, word, i, j-1, idx+1);

        board[i][j] = temp;

        return res;
    }
}
