public class Codec {
    ArrayList<String> l=new ArrayList<>();
    int[] pos={-1};
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        in_traverse(root);
        String data = String.join(",", l);
        return data;
    }
    public void in_traverse(TreeNode root){
        if(root==null){
            l.add("-1234");
            return ;
        }
        l.add(String.valueOf(root.val));
        in_traverse(root.left);
        in_traverse(root.right);
        return ;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] list = data.split(",");
        int i=0;
        while(i<list.length){
            l.add(list[i]);
            i++;
        }
        TreeNode a=new TreeNode(1);
        TreeNode root_node=traverse(l.size());
        return root_node;
    }
    public TreeNode traverse(int len){
        pos[0]+=1;
        if(len==0) return null;
        if(pos[0]>len-1) return null;
        String a=l.get(pos[0]);
        int b=Integer.parseInt(a);
        TreeNode node=new TreeNode(b);
        if(l.get(pos[0]).equals("-1234")){
            return null;
        }
        node.left=traverse(len);
        node.right=traverse(len);
        return node;

    }
}