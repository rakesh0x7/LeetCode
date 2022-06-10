class Solution {
   public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, max = 0;
        HashSet<Character> set = new HashSet<>();
        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                max = Math.max(max, set.size());
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}