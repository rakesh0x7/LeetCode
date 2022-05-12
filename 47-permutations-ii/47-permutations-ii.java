class Solution {
    
        

    private List<List<Integer>> recurPermute(int[] nums, ArrayList<Integer> ds, List<List<Integer>> ans, boolean[] freq){
        if(ds.size()==nums.length){
            if(!ans.contains(ds))
            ans.add(new ArrayList(ds));
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            
            if(!(freq[i])){
                freq[i] = true;
                ds.add(nums[i]);
                
                recurPermute(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
                
            }
        }
        return ans;
    }
        
        
        
        
        
        
   public List<List<Integer>> permuteUnique(int[] nums) {
        boolean  freq[] = new boolean[nums.length];
        ArrayList<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        recurPermute(nums,ds,ans,freq);
        return ans;
    }
}
        
 