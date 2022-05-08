class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> a = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (nums[i]!=nums[i-1] && i>0) ){
                int l=i+1;
                int h = nums.length-1;
                int sum = 0-nums[i];
                while(l<h){
                    if(nums[l]+nums[h]==sum){
                        a.add(Arrays.asList(nums[i],nums[l],nums[h]));
                        while(l<h && nums[l]==nums[l+1]) l++;
                        while(l<h && nums[h]==nums[h-1]) h--;
                        l++;
                        h--;
                    }
                     else if(nums[l]+nums[h]>sum){
                         h--;
                     }
                    else{
                        l++;
                    }
                }
            }
           
        }
        return a;
    }
}