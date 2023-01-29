class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int height1=maxDepth(root.left);
        int height2=maxDepth(root.right);
        return Math.max(height1,height2)+1;
    }
}