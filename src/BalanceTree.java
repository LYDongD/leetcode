import common.TreeBase;

public class BalanceTree extends TreeBase {

//    Given a binary tree, determine if it is height-balanced.
//
//            For this problem, a height-balanced binary tree is defined as:
//
//    a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
//
//    Example 1:
//
//    Given the following tree [3,9,20,null,null,15,7]:
//
//            3
//            / \
//            9  20
//            /  \
//            15   7
//    Return true.
//
//    Example 2:
//
//    Given the following tree [1,2,2,3,3,null,null,4,4]:
//
//            1
//            / \
//            2   2
//            / \
//            3   3
//            / \
//            4   4

    public static boolean isBalanced(TreeNode root) {

        return subTreeCount(root) >= 0;

    }

    public static int subTreeCount(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftCount = subTreeCount(root.left);
        int rightCount = subTreeCount(root.right);

        if (leftCount < 0 || rightCount < 0){
            return -1;
        }

        if (Math.abs(leftCount - rightCount) > 1){
            return  -1;
        }

        return Math.max(leftCount, rightCount) + 1;
    }

    public static void main(String args[]) {
        int nums[] = new int[]{3,4,5,6,7,8};
        TreeNode root = buildTree(nums);
        System.out.println(isBalanced(root));
    }

}
