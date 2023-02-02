class Solution {
    int count=0;
    int Ksmall_value=0;
    public int kthSmallest(TreeNode root, int k) {
        traverse(root,k);
        return Ksmall_value;
    }
    public void traverse(TreeNode root,int k){
        if(root==null) return ;
        traverse(root.left,k);
        count+=1;
        if(count==k) Ksmall_value=root.val;
        traverse(root.right,k);

    }
}