package common;

import java.util.LinkedList;

public class TreeBase {

    public static class TreeNode {

        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }


    public static void preOrderTraverse(TreeNode p) {

        if (p == null) {
            return;
        }

        System.out.print(p.value);
        System.out.print(", ");

        preOrderTraverse(p.left);
        preOrderTraverse(p.right);
    }

    public static TreeNode buildTree(int nums[]) {


        //1 创建节点列表
        LinkedList<TreeNode> nodelist = new LinkedList<>();
        for (int num : nums) {
            nodelist.add(new TreeNode(num));
        }

        if (nodelist.size() == 1){
            return nodelist.get(0);
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

}
