import java.util.LinkedList;

public class SameTree {

    private static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }


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


    public static void preOrderTraverse(TreeNode p) {

        if (p == null) {
            return;
        }

        System.out.print(p.value);

        preOrderTraverse(p.left);
        preOrderTraverse(p.right);
    }

    public static TreeNode buildTree(int nums[]) {
        //1 创建节点列表
        LinkedList<TreeNode> nodelist = new LinkedList<>();
        for (int num : nums) {
            nodelist.add(new TreeNode(num));
        }

        //2 创建树,根据父节点迭代生成
        for (int parentIndex = 0; parentIndex < nodelist.size() / 2 - 1; parentIndex++) {
            TreeNode currentParent = nodelist.get(parentIndex);
            currentParent.left = nodelist.get(parentIndex * 2 + 1);
            currentParent.right = nodelist.get(parentIndex * 2 + 2);
        }

        //3 单独处理最后一个父节点
        int lastParentindex = nodelist.size() / 2 - 1;
        TreeNode lastParent = nodelist.get(lastParentindex);
        lastParent.left = nodelist.get(lastParentindex * 2 + 1);
        if (nodelist.size() % 2 == 1) {
            lastParent.right = nodelist.get(lastParentindex * 2 + 2);
        }

        return nodelist.get(0);
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
