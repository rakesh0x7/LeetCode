class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int ans[] = new int[nums.length-k+1];
        int ri = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            
            q.offer(i);
            if(i>=k-1){
                ans[ri++] = nums[q.peek()];
            }
            
        }
        return ans;
        
    }
}


// O(n^2)
//      ArrayList<Integer> a = new ArrayList<>();
//         for(int i=0;i<nums.length-k+1;i++){
//             ArrayList<Integer> b = new ArrayList<>();
//             for(int j=i;j<i+k;j++){
//                 b.add(nums[j]);
//             }
// 			// System.out.println(b);
//             int temp = Collections.max(b);
//             a.add(temp);
//         }
        