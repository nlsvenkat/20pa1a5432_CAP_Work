class Solution {
    boolean c=true;
    int prev=-1;
    int curr=-1;
    int count=0;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return false;
        if(root.left==null && root.right==null) return true;
        check(root);
        return c;
    }
    public void check(TreeNode root){
        if(root==null) return ;
        check(root.left);
        curr=root.val;
        if(count==0) count++;
        else if(prev>=curr){
            c=false;
            return ;
        }
        prev=curr;
        check(root.right);
        return ; 
    }
}