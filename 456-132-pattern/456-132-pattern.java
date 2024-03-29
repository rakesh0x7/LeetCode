class Solution {
    public boolean find132pattern(int[] nums) {
       int len = nums.length;


        Deque<Integer> st = new ArrayDeque<>();
        int k = -1;
        for (int i = len - 1; i >= 0; i--) {
            if (k > -1 && nums[k] > nums[i]) {
                return true;
            }

            while (!st.isEmpty() && nums[i] > nums[st.peek()]) {
                k = st.pop();
            }

            st.push(i);
        }

        return false;
    }
}