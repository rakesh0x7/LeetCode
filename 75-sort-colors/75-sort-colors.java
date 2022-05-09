class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0;
        int h = nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                m++;
                l++;
            }
            else if(nums[m]==1){
                m++;
            }
            else if(nums[m]==2){
                int temp = nums[h];
                nums[h] = nums[m];
                nums[m] = temp;
                // m++;
                h--;
            }
        }
    }
}