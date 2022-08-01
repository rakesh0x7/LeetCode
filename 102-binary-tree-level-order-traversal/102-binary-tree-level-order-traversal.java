/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
            Queue<TreeNode> s = new ArrayDeque<>();
            s.add(root);
            while(!s.isEmpty()){
                List<Integer> ans = new ArrayList<>();
                int size = s.size();
                for(int i=0;i<size;i++){
                    root = s.poll();
                    ans.add(root.val);
                    if(root.left!=null) s.add(root.left);
                    if(root.right!=null)s.add(root.right);
                }

                result.add(ans);
            }
            return result;
        
    }
}