class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        TreeNode node=lca(root,p,q);
        return node;

    }
    TreeNode lca(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return null;
        if(root.val==p.val || root.val==q.val) return root;
        TreeNode left=lca(root.left,p,q);
        TreeNode right=lca(root.right,p,q);
        if(left==null && right==null) return null;
        if(left!=null && right!=null ) return root;
        if(left!=null) return left;
        if(right!=null) return right;
        return root;

    }
    
}