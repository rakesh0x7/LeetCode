class Solution
{
    public int mostWordsFound(String[] s) {

    int max = 1;
        for(int i = 0; i < s.length; i++){
            String[] arr = s[i].split(" ");
            max = Math.max(max,arr.length);
        }
        return max;
    }
}