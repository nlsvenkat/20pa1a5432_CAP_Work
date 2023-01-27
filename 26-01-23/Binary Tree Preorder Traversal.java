class Solution {
    ArrayList<Integer> pre_order=new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null ) return pre_order;
        pre_order.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return pre_order;
    }
}