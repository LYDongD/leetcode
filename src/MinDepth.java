import common.TreeBase;

public class MinDepth extends TreeBase {


//    Given a binary tree, find its minimum depth.
//
//    The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
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
//            return its minimum depth = 2.


    public static int minDepth(TreeNode root) {

        if (root == null){
            return 0;
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if (leftDepth == 0){
            return rightDepth + 1;
        }

        if (rightDepth == 0){
            return leftDepth + 1;
        }

        return Math.min(leftDepth, rightDepth) + 1;
    }


}
