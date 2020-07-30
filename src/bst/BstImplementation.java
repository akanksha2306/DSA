package bst;

public class BstImplementation {

    public Node createNewNode(int k) {
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }

    public Node insertNode(Node node, int valueOftheNode) {

        if (node == null) {
            return createNewNode(valueOftheNode);
        }
        if (valueOftheNode <= node.data) {
            node.left = insertNode(node.left, valueOftheNode);
        }
        if (valueOftheNode >= node.data) {
            node.right = insertNode(node.right, valueOftheNode);
        }
        return node;
    }

    public static void main(String[] args) {
        BstImplementation bst = new BstImplementation();
        Node root = null;
        root = bst.insertNode(root, 8);
        root = bst.insertNode(root, 9);
        root = bst.insertNode(root, 10);
        root = bst.insertNode(root, 4);
        root = bst.insertNode(root, 5);
        root = bst.insertNode(root, 6);
        System.out.println(root);
    }

    public Node delete(Node node, int val) {
        if (node == null) {
            return null;
        }
        if (val < node.data) {
            node.left = delete(node.left, val);
        } else if (val > node.data) {
            node.right = delete(node.right, val);
        } else {
            if (node.left == null || node.right == null) {
                Node temp = null;
                temp = node.left == null ? node.right : node.left;

                if (temp == null)
                    return null;
                else {
                    return node;
                }
            } else {
                Node successor = getSuccessor(node);
                node.data = successor.data;
                node.right = delete(node.right,4);
                //when both childs are there, i will find inorder successor and a replace the node to
                //be deleted with inorder successor.

            }
        }
        return node;
    }

    public Node getSuccessor(Node node) {
        if (node == null) {
            return null;
        }
        Node temp = node.right;
        while (temp.left != null){
            temp = temp.left;
        }
        return  temp;
    }

}
