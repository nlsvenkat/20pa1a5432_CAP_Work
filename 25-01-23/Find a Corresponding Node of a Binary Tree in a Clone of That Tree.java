class Solution {
    TreeNode root;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original==null) return null;
        getTargetCopy(original.left,cloned.left,target);
        getTargetCopy(original.right,cloned.right,target);
        if(original==target) root= cloned;
        return root;
        
    }
}