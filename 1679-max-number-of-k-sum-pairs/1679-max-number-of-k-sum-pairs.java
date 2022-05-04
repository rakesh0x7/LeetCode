class Solution {
    public int maxOperations(int[] nums, int k) {
        int cnt = 0;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i:nums) m.put(i,m.getOrDefault(i,0)+1);
        
        for(int i:m.keySet()){
            if(m.containsKey(i) && m.containsKey(k-i)){
                if(i!=k-i){
                    cnt += Math.min(m.get(i),m.get(k-i));
                    m.put(i,0);
                    m.put(k-i,0);
                }
                else{
                    cnt+= Math.floor(m.get(i)/2);
                }
            }
            
        }
        return cnt;
    }
}