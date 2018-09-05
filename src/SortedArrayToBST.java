import common.TreeBase;

public class SortedArrayToBST extends TreeBase {

//    Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
//
//    For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
//
//    Example:
//
//    Given the sorted array: [-10,-3,0,5,9],
//
//    One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
//
//            0
//            / \
//            -3   9
//            /   /
//            -10  5

    public static TreeNode sortedArrayToBST(int[] nums) {

        if (nums == null || nums.length == 0) {
            return null;
        }

        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public static TreeNode sortedArrayToBST(int[] nums, int left, int right) {

        if (left > right) {
            return null;
        }

        //select the middle element as the root
        int middle = (left + right) / 2;

        TreeNode root = new TreeNode(nums[middle]);

        //split the section from middle and recursive
        root.left = sortedArrayToBST(nums, left, middle - 1);
        root.right = sortedArrayToBST(nums, middle + 1, right);

        return root;
    }

    public static void main(String args[]) {

        int[] nums = new int[]{-10,-3,0,5,9};

        preOrderTraverse(sortedArrayToBST(nums));


//        preOrderTraverse(sortedArrayToBST(nums));

    }

}
