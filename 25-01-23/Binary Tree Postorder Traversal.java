class Solution {
    ArrayList<Integer> post_array=new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null) return post_array;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        post_array.add(root.val);
        return post_array;

    }
}