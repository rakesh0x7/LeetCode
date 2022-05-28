class Solution {
    public int missingNumber(int[] nums) {
        int[] a = new int[nums.length+1];
        int ans= nums.length;
        for(int i=0;i<nums.length;i++){
            a[nums[i]]++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<1){
                ans = i;
            }
        }
        return ans;
    }
}