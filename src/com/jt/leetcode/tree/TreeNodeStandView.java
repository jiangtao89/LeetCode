package com.jt.leetcode.tree;

/**
 * Created by jiangtao on 16/5/22.
 *
 * {@link "Binary Tree Right Side View https://leetcode.com/problems/binary-tree-right-side-view"}
 *
 * @author jiang.tao
 * @version 1.0.0
 */

import java.util.*;

public class TreeNodeStandView {

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> seeNode = new ArrayList<>();
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.remove();
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }

                if (i == size - 1) {
                    seeNode.add(node.val);
                }
            }
        }

        return seeNode;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

}
