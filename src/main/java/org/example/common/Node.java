package org.example.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
        children = new ArrayList<>();
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    public static Node fromArray(Integer[] data) {
        if (data == null || data.length == 0) {
            return null;
        }

        Node root = new Node(data[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;

        while (!queue.isEmpty() && index < data.length) {
            Node current = queue.poll();

            index++;

            while (index < data.length && data[index] != null) {
                Node child = new Node(data[index]);
                current.children.add(child);
                queue.offer(child);
                index++;
            }
        }

        return root;
    }
}
