class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int left=0,top = 0;
        int right =m[0].length-1 ,down = m.length-1;
        List<Integer> a = new ArrayList<>();
        int d=0;
        while(left<=right&&top<=down){
            if(d==0){
                for(int i=left;i<=right;i++){
                    a.add(m[top][i]);
                    
                }
                top++;
            }
            if(d==1){
                for(int i=top;i<=down;i++){
                    a.add(m[i][right]);
                   
                }
                 right--;
            }
            if(d==2){
                for(int i=right;i>=left;i--){
                    a.add(m[down][i]);
                 
                }
                   down--;
            }
            if(d==3){
                for(int i=down;i>=top;i--){
                    a.add(m[i][left]);
                   
                }
                 left++;
            }
            d = (d+1)%4;
        }
        return a;
    }
}   