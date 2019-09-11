package com.forOffer;


public class IsBTree {
    public boolean IsBalanced_Solution(TreeNode root){
    return  false;
    }
    public int getDepth(TreeNode root){
        if (root==null) return 0;
        int left=getDepth(root.left);
        if (left==-1) return -1;
        int right=getDepth(root.right);
        if (right==-1)return -1;
        return -1;
    }


    public boolean isBalanceTree(TreeNode root){
        if(root == null){
            return true;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left != null){
            isBalanceTree(root.left);
        }
        if(root.right != null){
            isBalanceTree(root.right);
        }
        return false;
    }
}
