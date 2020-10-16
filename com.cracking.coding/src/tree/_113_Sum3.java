package tree;

import java.util.ArrayList;
import java.util.List;

public class _113_Sum3 {

	
	
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, root, sum, new ArrayList<Integer>());
        return res;
    }
    private void helper(List<List<Integer>> res, TreeNode root, int sum, ArrayList<Integer> list){
        if(root == null) return;
        list.add(root.val);
        if(root.val == sum && root.left == null && root.right == null){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        if(root.left != null){
            helper(res, root.left, sum - root.val, list);
            list.remove(list.size() - 1);
        }
        if(root.right != null){
            helper(res, root.right, sum - root.val, list);
            list.remove(list.size() - 1);
        }
    }
}
