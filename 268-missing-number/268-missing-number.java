class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i;
            Arrays.sort(nums);
            for(i=0;i<n;i++)
            {
                if(nums[i]==i){
                    continue;
                }
                else{
                    break;
                }
               
            }
     return i;
    }
}