class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0) return null;
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            insert(root,preorder[i]);
        }
        return root;
    }
    public TreeNode insert(TreeNode root,int data) {
        TreeNode node=new TreeNode(data);
        if(root==null) return node;
        if(data>root.val){
            if(root.right==null) root.right=node;
            else insert(root.right,data);
        }
        else{
            if(root.left==null) root.left=node;
            else insert(root.left,data);
        }
        return root;
    	
    }
}