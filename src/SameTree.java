import common.TreeBase;

public class SameTree extends TreeBase{



    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.value == q.value){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        return false;


    }



    public static void main(String args[]) {
//        int nums[] = new int[]{1,2,3,4,5,6,7,8,9};
//        preOrderTraverse(buildTree(nums));

        int nums1[] = new int[]{1,2};
        int nums2[] = new int[]{1,0,2};
        preOrderTraverse(buildTree(nums1));
        preOrderTraverse(buildTree(nums2));
        System.out.println(isSameTree(buildTree(nums1), buildTree(nums2)));
    }

}
