class Solution {
    int data;
    TreeNode lca=new TreeNode(0);
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        traverse(root,p,q);
        return lca;
    }
    public void traverse(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return ;
        data=root.val;
        if(data==p.val){
            lca=root;
            return ;
        }
        if(data==q.val){
            lca=root;
            return ;
        }
        if((data>p.val && data<q.val) || (data>q.val && data<p.val)){
            lca=root;
            return;
        }
        else if(data<p.val) traverse(root.right,p,q);
        traverse(root.left,p,q);
    }
}