class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int fp = 0, lp = nums.length-1;
       while(fp<lp){
            if(nums[fp]%2!=0 ){
                if(nums[lp]%2==0){
                    int temp = nums[lp];
                    nums[lp] = nums[fp];
                    nums[fp] = temp;
                    lp--;
                    fp++;
                }
                else{
                    lp--;
                }
            }
            else{
                fp++;
            }
        }
        return nums;    }
}