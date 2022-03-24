class Solution {
    public int numRescueBoats(int[] p, int l) {
        Arrays.sort(p);
        int cnt=0;
        int j=p.length-1;
        int i=0;
        while(i<=j){
            if(p[i]+p[j]<=l){
                j--;
                i++;
            }
            else{
             
                j--;
            }
            cnt++;
        }
        return cnt;
    }
}