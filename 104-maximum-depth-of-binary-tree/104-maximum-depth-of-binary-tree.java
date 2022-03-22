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
    public int maxDepth(TreeNode root) {
                 if(root == null)  return 0;
        
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        // if(lh == -1|| rh==-1 ) return -1;
        // if(Math.abs(rh-lh)>1) return -1;
        return 1+Math.max(lh,rh);
    }
}