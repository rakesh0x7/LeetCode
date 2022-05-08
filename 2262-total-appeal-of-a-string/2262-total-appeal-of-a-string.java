class Solution {
    public long appealSum(String s) {
        int n = s.length();
        long[]  dp = new long[n+1];
        int[] a = new int[26];
        Arrays.fill(a,-1);
        long  ans = 0l;
        for(int i=0;i<n;i++){
            int ch = s.charAt(i)-'a';
            
            dp[i+1]= dp[i]+i-a[ch];
            ans += dp[i+1];
            a[ch] = i;
        }
        return ans;
    }
}