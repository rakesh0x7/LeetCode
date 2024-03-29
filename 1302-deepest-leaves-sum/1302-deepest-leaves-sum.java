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
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return root.val;
        }

        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelCount = queue.size();
            boolean isDeepest = true;
            sum = 0;
            for (int i = 0; i < levelCount; i++) {
                TreeNode curNode = queue.poll();
				
                if (curNode.left == null && curNode.right == null) {
                    sum += curNode.val;
                }
				
                if (curNode.left != null) {
                    isDeepest = false;
                    queue.offer(curNode.left);
                }
				
                if (curNode.right != null) {
                    isDeepest = false;
                    queue.offer(curNode.right);
                }
            }

            if (isDeepest && queue.isEmpty()) {
                return sum;
            }
        }

        return sum;
    }

}