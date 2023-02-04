class Solution {
    int prev=-1;
    int curr=-1;
    int count=0;
    int node_count=1;
    int[] max={1};
    TreeNode node=new TreeNode(0);
    HashMap<Integer,Integer> res_list =new HashMap<>();
    ArrayList<Integer> res_list2=new ArrayList<>();
    public int[] findMode(TreeNode root) {
        check(root);
        System.out.println(max[0]);
        for (Map.Entry<Integer,Integer> set :res_list.entrySet()) {
            if(set.getValue()==max[0]) res_list2.add(set.getKey());
        }
        int len=res_list2.size();
        int[] res=new int[len];
        if(len==0) return res;
        for(int i=0;i<len;i++){
            res[i]=res_list2.get(len-i-1);
        }
        return res;
    }
    
    public void check(TreeNode root){
        if(root==null) return ;
        check(root.left);
        curr=root.val;
        
        if(prev==curr){
            node_count+=1;
            if(node_count>=max[0]){
                max[0]=node_count;
                res_list.put(root.val,max[0]);
                
            }
        }
        else if(prev!=curr){
            node_count=1;
            res_list.put(root.val,node_count);
        }
        prev=curr;
        check(root.right);
        return ; 
    }
}