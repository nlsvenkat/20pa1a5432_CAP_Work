class Solution {
    int data=0;
    TreeNode a=new TreeNode(0);
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null) return null;
        if(root1!=null && root2!=null) data= root1.val+root2.val;
        else if(root1!=null) data=root1.val;
        else if(root2!=null) data=root2.val;
        TreeNode node=new TreeNode(data);
        
        if(root1!=null && root2==null) root2=a;
        if(root2!=null && root1==null) root1=a;

        node.left=mergeTrees(root1.left,root2.left);

        node.right=mergeTrees(root1.right,root2.right);
        return node;
    }
    
}