package leetcode;

import leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Test102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        helpOrder(res,root,0);
        return res;
    }

    public static void helpOrder(List<List<Integer>> res,TreeNode node,int level){
        if(node==null) return;
        if(res.size()>=level){
            res.add(new ArrayList<Integer>());
        }
        res.get(level).add(node.val);
        helpOrder(res,node.left,level+1);
        helpOrder(res,node.right,level+1);
    }
}
