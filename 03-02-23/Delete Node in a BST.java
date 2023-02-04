class Solution {
    TreeNode prev=null;
    TreeNode curr=null;
    TreeNode small=null;
    TreeNode prev_small=null;
    public TreeNode deleteNode(TreeNode root, int key) {
        traverse(root,key);
        if(prev!=null && curr!=null) System.out.println(curr.val+" curr, "+prev.val+" prev");
        if(prev==null && curr==null) return root;
        if( curr==null) return null;
        if(curr.left==null && curr.right==null){
            if(curr.val==root.val) return null;
            if(prev.left==curr)prev.left=null;
            else prev.right=null;
        }
        else if(curr.left==null){
            if(curr.val==root.val){
                TreeNode prev_small=root;
                TreeNode small=root.right;
                while(small.left!=null){
                    prev_small=small;
                    small=small.left;
                }
                int temp=root.val;
                root.val=small.val;
                small.val=temp;
                if(small.left==null && small.right==null){
                    if(prev_small.right==small) prev_small.right=prev_small.right.right;
                    else prev_small.left=prev_small.left.left;

                }
                else if(small.left==null){
                    if(prev_small.right==small) prev_small.right=prev_small.right.right;
                    else prev_small.left=prev_small.left.right;
                }
                else if(small.right==null){
                    if(prev_small.left==small) prev_small.left=prev_small.left.left;
                    else prev_small.right=prev_small.right.left;
                }
            }
            else if(prev.left==curr) prev.left= prev.left.right;
            else prev.right=prev.right.right;
        }
        else if(curr.right==null){
            if(curr.val==root.val){
                TreeNode prev_large=root;
                TreeNode large=root.left;
                while(large.right!=null){
                    prev_large=large;
                    large=large.right;
                }
                int temp=root.val;
                root.val=large.val;
                large.val=temp;
                if(large.left==null && large.right==null){
                    if(prev_large.right==large) prev_large.right=prev_large.right.right;
                    else prev_large.left=prev_large.left.left;

                }
                else if(large.left==null){
                    if(prev_large.right==large) prev_large.right=prev_large.right.right;
                    else prev_large.left=prev_large.left.right;
                }
                else if(large.right==null){
                    if(prev_large.left==large) prev_large.left=prev_large.left.left;
                    else prev_large.right=prev_large.right.left;
                }
            }
            else if(prev.left==curr) prev.left= prev.left.left;
            else prev.right=prev.right.left;
        }
        else{
            prev_small=curr;
            traverse_right(curr.right);
            int temp=small.val;
            small.val=curr.val;
            curr.val=temp;
            curr=small;
            prev= prev_small;
            System.out.println(curr.val+"curr     "+prev.val+"prev");
            if(curr.left==null && curr.right==null){
                if(prev.left.val==curr.val)prev.left=null;
                else prev.right=null;
            }
            else if(curr.left==null){
                if(prev.left==curr) prev.left= prev.left.right;
                else prev.right=prev.right.right;
            }
            else if(curr.right==null){
                if(prev.left==curr) prev.left= prev.left.left;
                else prev.right=prev.right.left;
            }
        }
        return root;
        
    }
    public void traverse_right(TreeNode root){
        small=root;
        while(small.left!=null){
            prev_small=small;
            small=small.left;
        }
        return ;
    }
    public void traverse(TreeNode root,int key){
        curr=root;
        boolean found=false;
        while(curr!=null){
            if(curr.val==key){
                found=true;
                break;
            }
            if(curr.val<key){
                prev=curr;
                curr=curr.right;
            }
            else{
                prev=curr;
                curr=curr.left;
            }
        }
        if(!found){
            prev=null;
            curr=null;
        }
        
    }
}