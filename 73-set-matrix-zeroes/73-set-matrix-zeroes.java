class Solution {
    public void setZeroes(int[][] m) {
       HashSet<Integer> rows = new HashSet<Integer>();
       HashSet<Integer> cols = new HashSet<Integer>();
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(rows.contains(i) || cols.contains(j)){
                    m[i][j] = 0;
                }
            }
        }
    }
}