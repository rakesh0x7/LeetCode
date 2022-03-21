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
    ArrayList<Integer> a = new ArrayList<>();
    public int countNodes(TreeNode root) {
        ord(root);
        return a.size();
    }
    public void ord(TreeNode root){
        if(root==null) return;
        a.add(root.val);
        ord(root.left);
        ord(root.right);
        
    }
}