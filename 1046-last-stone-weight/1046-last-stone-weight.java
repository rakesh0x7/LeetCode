class Solution {
    public int lastStoneWeight(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        if(a.size()==1) return nums[0];
        
        while(a.size()>1){
            Collections.sort(a);
            int x = a.remove(a.size()-1);
            int y = a.remove(a.size()-1);
            if(x==y){continue;}
            if(x!=y) a.add(x-y);
        }
        int ans =  (a.size()==1) ? a.get(a.size()-1):0;
        return ans;
    }
}