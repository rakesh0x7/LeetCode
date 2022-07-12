class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] q) {
        int[] ans = new int[nums.length];
         int sum = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%2==0) sum+=nums[j];
            }
        
        for(int i=0;i<q.length;i++){
           int cnt = 0;
           if(nums[q[i][1]]%2==0) 
               cnt = nums[q[i][1]];
           nums[q[i][1]] = nums[q[i][1]] + q[i][0];
           System.out.println("sum before"+ sum);
           if(nums[q[i][1]]%2==0){
               if(cnt%2==0)
                    sum = sum+nums[q[i][1]] - cnt;
               else sum = sum + nums[q[i][1]];
           }
        else{
            sum = sum -cnt;
        }
            System.out.println("sum after"+ sum);
            ans[i] = sum;
        }
        return ans;
    }
}