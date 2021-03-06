/**
 * Round 3 Nice done!
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        //2015-05-19 17:00:33 - 2015-05-19 17:04:38 (4 min)
        if(root == null)
            return true;
        
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        
        if(Math.abs(left - right) >= 2)
            return false;
        
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int getHeight(TreeNode root){
        if(root == null)
            return 0;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}







/**
 * Round 2 - still cannot get correct
 * DO THIS AGAIN
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {//4/20 15:40 - 15:43
       if(root == null)
            return true;
        
        int diff = Math.abs(getHeight(root.left) - getHeight(root.right));
        if(diff > 1)
            return false;
        else
            return isBalanced(root.left) && isBalanced(root.right);
    }
    private int getHeight(TreeNode root){
        if(root == null)
            return 0;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}









/**
 * DO THIS AGAIN
 * O(n)
 * O(1)
 * 259 ms
 * 
 * Note:
 *      Math.abs()
 *      You could have helper method.
 *      Think carefully and it must have solution if you think long time.
 *
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        int diff = Math.abs(height(root.left) - height(root.right));
        if(diff > 1)
            return false;
        else
            return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int height(TreeNode root){
        if(root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}