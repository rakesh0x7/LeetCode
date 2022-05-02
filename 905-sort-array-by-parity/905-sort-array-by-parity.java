class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i:nums){
            if(i%2==0) a.add(i);
            else b.add(i);
        }
        for(int i=0;i<a.size();i++){
            nums[i] = a.get(i);
        }
          for(int i=0;i<b.size();i++){
            nums[a.size()+i] = b.get(i);
        }
        return nums;
    }
}