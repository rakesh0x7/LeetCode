class Solution {
    public int removePalindromeSub(String s) {
        int j = s.length() - 1;
        for (int i = 0;  i < j; i++, j--)
		if (s.charAt(i) != s.charAt(j))
			return 2;
	return s.isEmpty() ? 0 : 1;
    }
}