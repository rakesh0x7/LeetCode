class Solution {
    public int[] runningSum(int[] nums) {
        // int[] b=new int[nums.length];
        // int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            // b[i]=prev+nums[i];
            // prev=b[i];
            nums[i] +=nums[i-1];
        }
        // b[0]=nums[0];
         return nums;
    }
}