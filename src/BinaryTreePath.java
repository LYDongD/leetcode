import common.TreeBase;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath extends TreeBase {

//    Given a binary tree, return all root-to-leaf paths.
//
//    Note: A leaf is a node with no children.
//
//    Example:
//
//    Input:
//
//            1
//            /   \
//            2     3
//            \
//            5
//
//    Output: ["1->2->5", "1->3"]
//
//    Explanation: All root-to-leaf paths are: 1->2->5, 1->3

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> pathList = new ArrayList<>();

        if (root == null) return pathList;

        String path;
        String rootPath =  root.value + "";

        if (root.left == null && root.right == null){
            path = rootPath;
            pathList.add(path);
        }

        if (root.left != null){
            for (String childPath : binaryTreePaths(root.left)){
                path = rootPath + "->" + childPath;
                pathList.add(path);
            }
        }

        if (root.right != null){
            for (String childPath : binaryTreePaths(root.right)){
                path = rootPath + "->" + childPath;
                pathList.add(path);
            }
        }

        return pathList;
    }
}
