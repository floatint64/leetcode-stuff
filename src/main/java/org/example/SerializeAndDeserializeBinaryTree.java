package org.example;

import org.example.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class SerializeAndDeserializeBinaryTree {
    private void serializeSub(TreeNode root, LinkedList<Integer> result) {
        if (root == null) {
            result.add(null);
            return;
        }

        result.add(root.val);
        serializeSub(root.left, result);
        serializeSub(root.right, result);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        LinkedList<Integer> result = new LinkedList<>();

        serializeSub(root, result);

        return result.toString();
    }

    private TreeNode deserializeSub(int[] iRef, ArrayList<TreeNode> nodes) {
        if (iRef[0] >= nodes.size()) {
            return null;
        }

        if (nodes.get(iRef[0]) == null) {
            iRef[0]++;
            return null;
        }

        TreeNode root = nodes.get(iRef[0]);
        iRef[0]++;

        root.left = deserializeSub(iRef, nodes);
        root.right = deserializeSub(iRef, nodes);

        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        ArrayList<TreeNode> nodeList = new ArrayList<>();

        int i = 1; // start index

        while (i < data.length() - 1) {
            while (data.charAt(i) == ' ') {
                i++;
            }
            int r = i;
            while (data.charAt(r) != ',' && r < data.length() - 1) {
                r++;
            }
            if (data.charAt(i) == '-' || Character.isDigit(data.charAt(i))) {
                int value = Integer.parseInt(data, i, r, 10);
                nodeList.add(new TreeNode(value));
            } else {
                nodeList.add(null);
            }
            i = r + 1;
        }

        if ((nodeList.size() & 1) == 0) {
            nodeList.add(null);
        }

        if (nodeList.isEmpty() || nodeList.get(0) == null) {
            return null;
        }

        int[] iRef = {0};
        return deserializeSub(iRef, nodeList);
    }
}
