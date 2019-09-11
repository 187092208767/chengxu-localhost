package com.forOffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的深度
 */
public class DepthOfTree {
    public static  void  main(String[] args){

    }
    public int TreeDepth(TreeNode root){
        if(root==null) return  0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int depth=0;
        while(!queue.isEmpty()){
            int length=queue.size();
            depth++;
            while (length>0){
                length--;
                TreeNode tmp=queue.peek();
                ((LinkedList<TreeNode>) queue).pop();

                if (tmp.left!=null) queue.offer(tmp.left);
                if (tmp.right!=null) queue.offer(tmp.right);
            }
        }
        return  depth;
    }
}

