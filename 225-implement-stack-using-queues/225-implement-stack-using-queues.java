class MyStack {
    ArrayList<Integer> a ;
    public MyStack() {
        a = new ArrayList<>();
    }
    
    public void push(int x) {
        
        a.add(x);
    }
    
    public int pop() {
       int temp= a.get(a.size()-1);
        a.remove(a.size()-1);
        return temp;
    }
    
    public int top() {
        int temp= a.get(a.size()-1);
        // a.remove(a.size()-1);
        return temp;
    }
    
    public boolean empty() {
        return a.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */