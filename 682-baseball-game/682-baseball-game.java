class Solution {
    public int calPoints(String[] ops) {
       Stack<Integer> st = new Stack<>();
        for(String op : ops) {
            if(op.equals("+")) {
                int p = st.pop();
                int q = st.peek();
                int s = p + q;
                st.push(p);
                st.push(s);
            } else if(op.equals("C")) {
                st.pop();
            } else if(op.equals("D")) {
                st.push(2* st.peek());
            } else {
                st.push(Integer.valueOf(op));
            }
        }
        int count = 0;
        while(!st.isEmpty()) {
            count += st.pop();
        }
        return count;
    }
}