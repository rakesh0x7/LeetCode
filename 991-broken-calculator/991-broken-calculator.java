class Solution {
    public int brokenCalc(int x, int y) {
        int count = 0;

        while(y>x){
            count++;
            if(y%2==0){
                y /=2;
            }
            else{
                y++;
            }
            
        }
        return count+(x-y);
    }
}