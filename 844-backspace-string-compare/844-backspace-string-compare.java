class Solution {
    public Stack<Character> makeStack(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='#'){
                if(st.size()>0)
                st.pop();
            }else{
                st.push(ch);
            }
        }
        return st;
    }
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=makeStack(s);
        Stack<Character> st2=makeStack(t);
        
        if(st1.size()!=st2.size()){
            return false;
        }
        
        while(st1.size()>0){
            if(st1.peek()!=st2.peek()) return false;
            st1.pop();
            st2.pop();
        }
        return true;
    }
}