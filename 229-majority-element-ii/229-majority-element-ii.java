class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> m = new HashMap<>();
        
        for(int i: nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            if(entry.getValue()>nums.length/3) ans.add(entry.getKey());
        }
        return ans;
    }
}