import common.TreeBase;

public class MaxDepth extends TreeBase {


//    Given a binary tree, find its maximum depth.
//
//    The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//
//    Note: A leaf is a node with no children.
//
//    Example:
//
//    Given binary tree [3,9,20,null,null,15,7],
//
//            3
//            / \
//            9  20
//            /  \
//            15   7
//            return its depth = 3.


    public static int maxDepth(TreeNode root) {

        return maxDepth(root, 1);
    }


    public static int maxDepth(TreeNode root, int currentDepth){

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return currentDepth;
        }else {
            currentDepth++;
        }

        return Math.max(maxDepth(root.left, currentDepth), maxDepth(root.right, currentDepth));
    }

    public static void main(String args[]) {
        int[] nums = new int[]{3};
        System.out.println(maxDepth(buildTree(nums)));
    }


}
