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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> am=new ArrayList<>(); 
        preorder(root,am);
     return am;   
    }
private void preorder(TreeNode root,List<Integer>am){
    if(root==null) return;
   am.add(root.val);
    preorder(root.left,am);
    preorder(root.right,am);
}
}