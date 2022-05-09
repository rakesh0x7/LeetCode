class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for(int i:nums) a.add(i);
        int i=1;
        while(a.contains(i))i++;
        return i;
    }
}