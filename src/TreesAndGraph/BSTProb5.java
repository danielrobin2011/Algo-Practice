package TreesAndGraph;

import java.util.LinkedList;
import java.util.Queue;

public class BSTProb5 {

    public boolean checkIfBST(BinaryTreeNode root) {

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
                if (node.left.value > node.value) {
                    return false;
                }
            }
            if (node.right != null) {
                queue.add(node.right);
                if (node.right.value < node.value) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        BSTProb2 bstProb2 = new BSTProb2();
        BinaryTreeNode binaryTreeNode = bstProb2.createBSTWithMinHeight(arr);

        BinaryTreeNode binaryTreeNode1 = new BinaryTreeNode(1);
        BinaryTreeNode binaryTreeNode2 = new BinaryTreeNode(2);
        binaryTreeNode.right.right.right = binaryTreeNode1;
        binaryTreeNode.right.right.right.right = binaryTreeNode2;

        TreePrinter.print(binaryTreeNode);

        BSTProb5 bstProb5 = new BSTProb5();
        System.out.println(bstProb5.checkIfBST(binaryTreeNode));
    }

}
