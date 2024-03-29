class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      
       Map<Integer, Integer> countMap = new HashMap<>();
    List<Integer> ret = new ArrayList<>();
    for (int n : nums) {
        if (countMap.containsKey(n)) {
            countMap.put(n ,countMap.get(n)+1);
        } else {
            countMap.put(n ,1);
        }
    }
   PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<Map.Entry<Integer, Integer>>((o1, o2) -> o2.getValue() - o1.getValue());
    pq.addAll(countMap.entrySet());
    
    List<Integer> res = new ArrayList<>();
    for(int i = 0; i < k; i++){
        res.add(pq.poll().getKey());
    }
   
        int ans[] = new int[res.size()];
        for(int i=0;i<res.size();i++) ans[i] = res.get(i);
        return ans;
    }
}