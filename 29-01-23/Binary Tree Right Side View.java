class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        int count=0;
        List<Integer> final_list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null) return final_list;
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode a=queue.peek();
            List<Integer> list=new ArrayList<>();
            count=queue.size();
            while(count>0){
                if(a.left!=null){
                    queue.offer(a.left);
                }
                if(a.right!=null){
                    queue.offer(a.right);
                }
                list.add(queue.poll().val);
                a=queue.peek();
                count-=1;
            }
            if(list.size()>0) final_list.add(list.get(list.size()-1));
            
        }
        return final_list;
    }
}