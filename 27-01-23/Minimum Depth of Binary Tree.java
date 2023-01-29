class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int height1=minDepth(root.left);
        int height2=minDepth(root.right);
        if(height1==0 && height2==0 ) return  1;
        if(height1==0 ) return height2+1;
        if(height2==0) return height1+1;
        return Math.min(height1,height2)+1;
    }
}