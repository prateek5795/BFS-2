// Time Complexity : O(n)
// Space Complexity : O(height of tree)
// Did this code successfully run on Leetcode : Yes

import java.util.*;

public class BinaryTreeRightSideView {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> rightSideView(TreeNode root) {
        // reverse level traversal
        List<Integer> result = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();

        if (root == null)
            return result;

        queue.offer(root);
        while (queue.size() != 0) {
            int size = queue.size();
            for (int i=0; i<size; i++) {
                TreeNode cur = queue.poll();
                if (i == 0)
                    result.add(cur.val);

                if (cur.right != null)
                    queue.offer(cur.right);

                if (cur.left != null)
                    queue.offer(cur.left);
            }

        }

        return result;
    }
}
