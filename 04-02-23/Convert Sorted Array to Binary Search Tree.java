class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=insertIntoBST(nums, 0,nums.length-1);
        return root;
    }
    public TreeNode insertIntoBST(int[] nums, int start,int end) {
        if(start>end) return null;
        if(start==end) return new TreeNode(nums[start]);
        int pos=position(start,end);
        TreeNode node=new TreeNode(nums[pos]);
        node.left=insertIntoBST(nums, start,pos-1);
        node.right=insertIntoBST(nums, pos+1,end);
        return node;

    }
    public int position(int i,int j){
        int value=(int) Math.ceil(i+((j-i)/2));
        return value;
    }
}