package org.example;

import org.example.common.Node;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class NAryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return List.of();
        }

        Deque<Node> nodes = new LinkedList<>();
        nodes.push(root);

        List<Integer> result = new ArrayList<>(10000);

        while (!nodes.isEmpty()) {
            Node popped = nodes.pop();
            if (popped.children != null && !popped.children.isEmpty()) {
                for (int i = popped.children.size() - 1; i >= 0; i--) {
                    nodes.push(popped.children.get(i));
                }
            }

            result.add(popped.val);
        }

        return result;
    }
}
