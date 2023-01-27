class Solution {
    ArrayList<Integer> in1_traversal=new ArrayList<Integer>();
    ArrayList<Integer> in2_traversal=new ArrayList<Integer>();
    public boolean isSymmetric(TreeNode root) {
        inorderTraversal1(root.left);
        inorderTraversal2(root.right);
        int i=0,size1=in1_traversal.size(),size2=in2_traversal.size();
        if(size1!=size2) return false;
        while(i<size1){
            System.out.println(in1_traversal.get(i)+"    "+in2_traversal.get(i));
            if(in1_traversal.get(i)!=in2_traversal.get(i)){
                return false;
            }
            i++;
        }
        return true;

    }


    
    public List<Integer> inorderTraversal2(TreeNode root) {
        if(root==null){
            in2_traversal.add(-1);
            return in2_traversal;
        }
        in2_traversal.add(root.val);
        inorderTraversal2(root.left);
        inorderTraversal2(root.right);
        return in2_traversal;
    }



    
    public List<Integer> inorderTraversal1(TreeNode root) {
        if(root==null){
            in1_traversal.add(-1);
            return in1_traversal;
        }
        in1_traversal.add(root.val);
        inorderTraversal1(root.right);
        inorderTraversal1(root.left);
        return in1_traversal;
    }
}