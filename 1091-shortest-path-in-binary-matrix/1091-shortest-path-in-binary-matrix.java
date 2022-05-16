class Solution {
    public class Pair{
        int r;
        int c;
        int val;
        Pair(int r,int c ,int val){
            this.r=r;
            this.c=c;
            this.val=val;
        }
    }
    public boolean check(int[][] grid,int row,int col){
        if(grid.length<=row || row<0 || grid[0].length<=col || col<0){
            return false;
        }
        if(grid[row][col]==1){
            return false;
        }
       
        return true;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1 || grid[grid.length-1][grid[0].length-1]==1){
            return -1;
        }
        int[][] dir={{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};
        
        int min=Integer.MAX_VALUE;
        Queue<Pair> queue=new LinkedList<>();
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        queue.add(new Pair(0,0,1));
        while(queue.size()>0){
            Pair temp=queue.remove();
            int row=temp.r;
            int col=temp.c;
            if(row==grid.length-1 && col==grid[0].length-1){
                min=Math.min(temp.val,min);
            }
            if(visited[row][col]==true){
                continue;
            }
            visited[row][col]=true;
            for(int[] i:dir){
                int x_row=i[0]+row;
                int y_col=i[1]+col;
                
                if(check(grid,x_row,y_col) && visited[x_row][y_col]==false){
                    queue.add(new Pair(x_row,y_col,temp.val+1));
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}