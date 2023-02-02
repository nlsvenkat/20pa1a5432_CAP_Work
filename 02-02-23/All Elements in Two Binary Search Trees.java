class Solution {
    List<Integer> l=new ArrayList<>();

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        inorder(root1);
        inorder(root2);
        Collections.sort(l);
        return l;
    }
    public void inorder(TreeNode root){
        if(root==null) return ;
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);

    }
}