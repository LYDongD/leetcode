import common.TreeBase;

public class SymmetricTree extends TreeBase {

//    Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
//    For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
//
//            1
//            / \
//            2   2
//            / \ / \
//            3  4 4  3
//    But the following [1,2,2,null,3,null,3] is not:
//            1
//            / \
//            2   2
//            \   \
//            3    3


    public static boolean isSymmetric(TreeNode root) {

        return root == null ? true : isSymmetric(root.left, root.right);

    }

    public static boolean isSymmetric(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.value != right.value) {
            return false;
        }

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }


}
