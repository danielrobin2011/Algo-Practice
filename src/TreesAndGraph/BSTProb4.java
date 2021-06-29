package TreesAndGraph;

import java.util.List;
import java.util.Map;

public class BSTProb4 {

    public int diffBalanced(BinaryTreeNode node) {

        if (node == null) return 0;

        int lh = 0;
        int rh = 0;

        if (node.left != null) {
            lh = 1 + diffBalanced(node.left);
        }
        if (node.right != null) {
            rh = 1 + diffBalanced(node.right);
        }
        return Math.abs(lh - rh);
    }

    public boolean checkBalanced(BinaryTreeNode root) {
        int diff = diffBalanced(root);
        System.out.println(diff);
        return diff <= 1;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        BSTProb2 bstProb2 = new BSTProb2();
        BinaryTreeNode binaryTreeNode = bstProb2.createBSTWithMinHeight(arr);

        BinaryTreeNode binaryTreeNode1 = new BinaryTreeNode(11);
        BinaryTreeNode binaryTreeNode2 = new BinaryTreeNode(12);
//        binaryTreeNode.right.right.right = binaryTreeNode1;
//        binaryTreeNode.right.right.right.right = binaryTreeNode2;

        TreePrinter.print(binaryTreeNode);

        BSTProb3 bstProb3 = new BSTProb3();
        Map<Integer, List<Integer>> map = bstProb3.listOfDepths(binaryTreeNode);

        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });

        BSTProb4 bstProb4 = new BSTProb4();
        boolean check = bstProb4.checkBalanced(binaryTreeNode);
        System.out.println(check);
    }

}
