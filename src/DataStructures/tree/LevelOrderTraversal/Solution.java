package DataStructures.tree.LevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static List<List<Integer>> levelOrder(TreeNode root) {


        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int queueSize = q.size();

            List<Integer> currentArrayist = new ArrayList<>(queueSize);

            for (int i = 0; i < queueSize; i++) {

                TreeNode currentNode = q.poll();
                assert currentNode != null;
                currentArrayist.add(currentNode.val);

                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
            res.add(currentArrayist);

        }
        return res;

    }
        public static void main (String[]args){
            TreeNode root = new TreeNode(12);
            root.left = new TreeNode(7);
            root.right = new TreeNode(1);
            root.left.left = new TreeNode(9);
            root.right.left = new TreeNode(10);
            root.right.right = new TreeNode(5);

            List<List<Integer>> result = levelOrder(root);
            System.out.println(result);


        }

    }

