class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>a = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        int maxfreq = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> d :a.entrySet()){
            if(d.getKey()%2==0 ){
                maxfreq = Math.max(d.getValue(),maxfreq);
            }
        }
        
        
        
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> d :a.entrySet()){
            if(d.getKey()%2==0 && d.getValue()==maxfreq){
                min = Math.min(d.getKey(),min);
            }
        }
        if(min == Integer.MAX_VALUE) min = -1;
        return min;
    }
}