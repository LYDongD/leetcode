import common.TreeBase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderBottom extends TreeBase {

//    Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
//
//    For example:
//    Given binary tree [3,9,20,null,null,15,7],
//            3
//            / \
//            9  20
//            /  \
//            15   7
//            return its bottom-up level order traversal as:
//            [
//            [15,7],
//            [9,20],
//            [3]
//            ]


    public static List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> treeList = new ArrayList<>();
        levelOrderBottom(root, treeList, 1);
        return treeList;
    }


    public static void levelOrderBottom(TreeNode root, List<List<Integer>> treeList, int level) {

        if (root == null) {
            return;
        }

        if (treeList.size() < level) {
            treeList.add(0, new LinkedList<>());
        }

        levelOrderBottom(root.left, treeList, level + 1);
        levelOrderBottom(root.right, treeList, level + 1);

        treeList.get(treeList.size() - level).add(root.value);
    }


    public static void main(String args[]) {

        TreeNode root = buildTree(new int[]{3,9,20,0,-1,3,4});

        System.out.println(levelOrderBottom(root));

    }


}
