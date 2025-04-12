package binarytree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author inayath on 29/11/24
 * @project dsa
 */
public class TreeFromPreorderAndInorder {
    static Map<Integer, Integer> inorderMap = new HashMap<>();
    static int preorderIndex = 0;

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        // Populate inorderMap to find the index of any value in inorder array
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        // Start the tree construction with the entire range of the inorder array
        return construct(preorder, inorder, 0, inorder.length - 1);
    }

    public static TreeNode construct(int[] preorder, int[] inorder, int startIndex, int endIndex) {
        // If the start index exceeds the end index, return null
        if (startIndex > endIndex) {
            return null;
        }

        // Create the current node from preorder[preorderIndex]
        TreeNode node = new TreeNode(preorder[preorderIndex]);
        // Increment preorderIndex for the next recursive call
        preorderIndex++;

        // Find the index of the current node in the inorder array
        int inorderIndex = inorderMap.get(node.data);

        // Build the left subtree using the elements to the left of inorderIndex
        node.left = construct(preorder, inorder, startIndex, inorderIndex - 1);

        // Build the right subtree using the elements to the right of inorderIndex
        node.right = construct(preorder, inorder, inorderIndex + 1, endIndex);

        return node;
    }
    public static void main(String[] args) {
        int[] preorder = new int[] {3,9,20,15,7};
        int[] inorder = new int[] {9,3,15,20,7};
        System.out.println(buildTree(preorder, inorder));
    }
}
