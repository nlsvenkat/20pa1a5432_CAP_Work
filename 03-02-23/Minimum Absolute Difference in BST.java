class Solution {
    int count=0;
    ArrayList<Integer> al=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        traverse(root);
        int min=al.get(1)-al.get(0);
        for(int i=1;i<al.size();i++){
            int a=al.get(i)-al.get(i-1);
            if(a<min) min=a;
        }
        return min;
    }
    public void traverse(TreeNode root){
        if(root==null) return ;
        traverse(root.left);
        al.add(root.val);
        traverse(root.right);
    }
}