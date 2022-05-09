class Solution {
    String map[] = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> rvs ;
    public List<String> letterCombinations(String d) {
        rvs = new ArrayList<>();
        if(d.length()==0) return rvs;
        lettercombrec(0,d,new StringBuilder());
        return rvs;
        
    }
    
    public void lettercombrec(int len,String d, StringBuilder temp){
        if(len == d.length() ){
            rvs.add(temp.toString());
            return;
        }
        
        char cd = d.charAt(len);
        String s = map[cd-'0'];
        for(char c:s.toCharArray()){
            temp.append(c);
            lettercombrec(len+1,d,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}