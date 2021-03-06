import java.util.ArrayList;
import java.util.List;


public class Solution3 {

    private void dfs(TreeNode treeNode, List<Integer> res) {
        if (treeNode == null) {
            return;
        }
        res.add(treeNode.val);
        dfs(treeNode.left, res);
        dfs(treeNode.right, res);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root,res);
        return res;
    }
}
