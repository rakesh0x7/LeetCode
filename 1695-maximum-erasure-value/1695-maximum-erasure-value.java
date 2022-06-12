class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        // int maxscore = 0;
        // for(int i=0;i<nums.length;i++){
        //     ArrayList<Integer> a = new ArrayList<>();
        //     a.add(nums[i]);
        //     int sum = 0;
        //     sum = sum + nums[i];
        //     for(int j=i+1;j<nums.length;j++){
        //         if(!a.contains(nums[j])){
        //             a.add(nums[j]);
        //             sum += nums[j];
        //         }
        //         else{
        //             break;
        //         }
        //     }
        //     maxscore = Math.max(sum, maxscore);
        // }
        // return maxscore;
        // ----------------------------------------O(n2)--------------------------------------------------------------//
        int maxScore = 0, currScore = 0;
	Set<Integer> set = new HashSet<>();

	for (int l=0, r=0; r<nums.length; r++) {
		while (!set.add(nums[r])) {
			currScore -= nums[l];
			set.remove(nums[l++]);
		}
		currScore += nums[r];
		maxScore = Math.max(maxScore, currScore);
	}

	return maxScore;
    }
}