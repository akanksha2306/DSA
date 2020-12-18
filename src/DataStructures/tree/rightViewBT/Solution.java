package DataStructures.tree.rightViewBT;


import DataStructures.tree.LevelOrderTraversal.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {


    // function to print right view of binary tree
    public static List<Integer> printRightView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null)
            return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);


        while (!queue.isEmpty()) {
            // number of nodes at current level
            int n = queue.size();

            // Traverse all nodes of current level
            for (int i = 1; i <= n; i++) {
                TreeNode temp = queue.poll();

                // Print the left most element at
                // the level
                if (i == n) {
                    assert temp != null;
                    list.add(temp.val);

                }
                assert temp != null;
                if (temp.left != null) {
                    queue.add(temp.left);
                 }

                // Add right node to queue
                assert temp != null;
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // construct binary tree as shown in
        // above diagram
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(8);
        root.right.right = new TreeNode(15);
        root.right.left = new TreeNode(12);
        root.right.right.left = new TreeNode(14);

        List<Integer> ans = printRightView(root);
        System.out.println(ans);
    }
}

