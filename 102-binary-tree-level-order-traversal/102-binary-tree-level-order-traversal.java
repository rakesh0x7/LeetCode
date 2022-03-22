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
    List<List<Integer>> a  = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        ord(root);
        return a;
        
    }
    public void ord(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return;
        // 
        
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> aa = new ArrayList<>();
            while(size-- >0){
                TreeNode temp = q.poll();
                aa.add(temp.val);
                if(temp.left!= null) q.offer(temp.left);
                if(temp.right!= null) q.offer(temp.right);
             }     
            a.add(aa);
        }
    }
}