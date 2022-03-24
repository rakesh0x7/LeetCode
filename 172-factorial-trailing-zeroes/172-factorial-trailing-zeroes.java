class Solution {
    public int trailingZeroes(int n) {
      int count = 0;
        int i =1;
        int s =1;
        while(s<n){
             s = (int) Math.pow(5,i);
            count = count + (int) Math.floor(n/s);
            // n = n/s;
            i++;
        }
    return count;}
    }