class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        nqueens(board,0,ans);
        return ans;
    }
    
    void nqueens(boolean[][] board, int row,List<List<String>> ans){
        if(row == board.length){
            List<String> p = new ArrayList<>();
            String str = "";
            for(boolean[] nums : board){
               for(boolean element : nums){
                  if(element){
                    str += "Q";
                  }
                   else{
                    str += ".";
                  }
               }
                p.add(str);
                str = "";
            }
            ans.add(new ArrayList(p));
        }
        
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                nqueens(board, row + 1, ans);
                board[row][col] = false;
            }
        }
    }
    
    boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft ; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

       
        int maxRight = Math.min(row,board.length - col -1);
        for (int i = 0; i <= maxRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }
}