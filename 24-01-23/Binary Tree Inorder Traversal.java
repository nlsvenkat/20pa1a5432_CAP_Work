class Solution {
    ArrayList<Integer> inorder_traversal=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return inorder_traversal;
        inorderTraversal(root.left);
        inorder_traversal.add(root.val);
        inorderTraversal(root.right);
        return inorder_traversal;
    }
}