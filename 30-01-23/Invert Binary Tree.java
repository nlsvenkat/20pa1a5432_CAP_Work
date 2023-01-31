class Solution {
    ArrayList<Integer> l=new ArrayList<>();
    int[] pos={-1};
    public TreeNode invertTree(TreeNode root) {
        in_traverse(root);
        int len=l.size();
        
        root= traverse(len);
        return root;
    }
    public TreeNode traverse(int len){
        pos[0]+=1;
        if(len==0) return null;
        if(pos[0]>len-1) return null;

        TreeNode node=new TreeNode(l.get(pos[0]));
        
        
        if(l.get(pos[0])==-123){
            return null;
        }

        node.left=traverse(len);
        node.right=traverse(len);
        return node;

    }
    public void in_traverse(TreeNode root){
        if(root==null){
            l.add(-123);
            return ;
        }
        l.add(root.val);
        in_traverse(root.right);
        in_traverse(root.left);
        return ;
    }
}