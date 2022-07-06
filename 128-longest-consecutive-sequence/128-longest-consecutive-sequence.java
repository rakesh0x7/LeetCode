class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int max = 0;
        // for(int i:nums) System.out.println(i);
        int cnt = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1 == nums[i+1]){
                System.out.println(" d" + nums[i]);
                cnt++;
            }
            else if(nums[i] == nums[i+1]) continue;
            else{
                max = Math.max(max,cnt);
                cnt = 0;
            }
            
        }
        return max>cnt?max+1:cnt+1;
    }
}