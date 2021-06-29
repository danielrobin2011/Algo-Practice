package TreesAndGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BSTProb3 {

    Map<Integer, List<Integer>> map = new HashMap<>();

    public Map<Integer, List<Integer>> listOfDepths(BinaryTreeNode root) {
        preOrderTraversal(root, 0);
        return map;
    }

    public void preOrderTraversal(BinaryTreeNode node, int height) {

        if (node == null) {
            return;
        }
        List<Integer> list;
        if (map.containsKey(height)) {
            list = map.get(height);
        } else {
            list = new ArrayList<>();
            map.put(height, list);
        }
        height++;
        list.add(node.value);
        preOrderTraversal(node.left, height);
        preOrderTraversal(node.right, height);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        BSTProb2 bstProb2 = new BSTProb2();
        BinaryTreeNode binaryTreeNode = bstProb2.createBSTWithMinHeight(arr);

        BinaryTreeNode binaryTreeNode1 = new BinaryTreeNode(11);
        BinaryTreeNode binaryTreeNode2 = new BinaryTreeNode(12);
        binaryTreeNode.right.right.right = binaryTreeNode1;
        binaryTreeNode.right.right.right.right = binaryTreeNode2;

        TreePrinter.print(binaryTreeNode);

        BSTProb3 bstProb3 = new BSTProb3();
        Map<Integer, List<Integer>> map = bstProb3.listOfDepths(binaryTreeNode);

        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
    }

}
