class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
                List<List<Integer>> ans = new ArrayList<>();

        if (k <= 0 || n <= 0 || k > n) {
            return ans;
        }

        if (n > (19 - k) * k / 2) {
            return ans;
        }

        for (int mask = 0; mask < (1 << 9); mask++) {
            List<Integer> path = new ArrayList<>();
            if (check(path, mask, k, n)) {
                ans.add(path);
            }
        }

        return ans;
    }

    public boolean check(List<Integer> path, int mask, int k, int target) {
        path.clear();
        
        for (int i = 0; i < 9; i++) {
            if (((1 << i) & mask) != 0) {
                path.add(i + 1);
            }
        }

        if (path.size() != k) {
            return false;
        }

        int sum = 0;
        for (int x : path) {
            sum += x;
        }

        return sum == target;
    
    }
}