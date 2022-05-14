class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] arr = new int[nums.length+1];
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           arr[nums[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1) ans.add(i);
        }
        return ans;
    }
}