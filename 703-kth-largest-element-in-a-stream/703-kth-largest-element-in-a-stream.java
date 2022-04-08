class KthLargest {

//     ArrayList<Integer> a = new ArrayList<>();
//     int b;
//     public KthLargest(int k, int[] nums) {
//         b=k;
//         for(int i:nums) a.add(i);
        
//     }    tccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc
    
//     public int add(int val) {
       
//         a.add(val);
//         Collections.sort(a,Collections.reverseOrder());
//         return a.get(b-1);
    int k;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i = 0; i < nums.length; i++){
            minHeap.add(nums[i]);
            if(minHeap.size() > k)
                minHeap.poll();
        }
        
    }
    
    public int add(int val) {
        minHeap.add(val);
        if(minHeap.size() > k)
            minHeap.poll();
        return minHeap.peek();
    
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */