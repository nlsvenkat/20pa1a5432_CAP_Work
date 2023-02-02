class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node=new TreeNode(val);
        if(root==null) return node;
        if(val>root.val){
            if(root.right==null) root.right=node;
            else insertIntoBST(root.right,val);
        }
        else{
            if(root.left==null) root.left=node;
            else insertIntoBST(root.left,val);
        }
        return root;
    }
}