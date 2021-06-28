package TreesAndGraph;

import java.util.Arrays;

public class BSTProb2 {

    public BinaryTreeNode createBSTWithMinHeight(int arr[]) {
         return createBSTWithMinHeightRecurse(arr, 0, arr.length - 1);
    }

    public BinaryTreeNode createBSTWithMinHeightRecurse(int[] arr, int start, int end) {

        if (end < start) {
            return null;
        }

        int midIndex = (start + end) / 2;
        BinaryTreeNode node = new BinaryTreeNode(arr[midIndex]);
        node.left = createBSTWithMinHeightRecurse(arr, start, midIndex - 1);
        node.right = createBSTWithMinHeightRecurse(arr, midIndex + 1, end);
        return node;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        BSTProb2 bstProb2 = new BSTProb2();
        BinaryTreeNode binaryTreeNode = bstProb2.createBSTWithMinHeight(arr);
        TreePrinter.print(binaryTreeNode);
    }

}
