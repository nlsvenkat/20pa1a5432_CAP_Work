class Solution {
    ArrayList<Integer> l=new ArrayList<>();
    public void flatten(TreeNode root) {
        preorder(root);
        if (root==null) return ;
        if(root.right==null && root.left==null) return ;
        TreeNode curr=root;
        int i=1;
        while(i<l.size()){
            TreeNode a=new TreeNode(l.get(i));
            curr.right=a;
            curr.left=null;
            curr=curr.right;
            i++;
        }
        return ;
    }
    public void preorder(TreeNode root){
        if(root==null) return ;
        l.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}