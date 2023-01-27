class Solution {
    boolean c=true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return c;

    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int height1=height(root.left);
        int height2=height(root.right);
        if(Math.abs(height1-height2)>1) c=false;
        return Math.max(height1,height2)+1;
    }
}