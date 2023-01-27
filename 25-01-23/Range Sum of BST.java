class Solution {
    int sum=-0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        if(root.val>low && root.val<high){
            rangeSumBST(root.left,low,high);
            rangeSumBST(root.right,low,high);
            sum+=root.val;
        }
        if(root.val<low) rangeSumBST(root.right,low,high);
        if(root.val>high) rangeSumBST(root.left,low,high);
        if(root.val==low){
            sum+=low;
            rangeSumBST(root.right,low,high);
        }
        if(root.val==high){
            sum+=high;
            rangeSumBST(root.left,low,high);
        }
        return sum;
    }
}