package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerializeAndDeserializeBSTTest {
    @Test
    void serAndDeser() {
        SerializeAndDeserializeBST ser = new SerializeAndDeserializeBST();
        SerializeAndDeserializeBST deser = new SerializeAndDeserializeBST();

        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));

        String serialized = ser.serialize(root);

        Assertions.assertEquals(root.traversalInLevelOrder(), deser.deserialize(serialized).traversalInLevelOrder());
    }

    @Test
    void serAndDeser2() {
        SerializeAndDeserializeBST ser = new SerializeAndDeserializeBST();
        SerializeAndDeserializeBST deser = new SerializeAndDeserializeBST();

        TreeNode root = new TreeNode(5200, new TreeNode(8931, new TreeNode(7549), null), new TreeNode(1406, null, new TreeNode(777)));

        String serialized = ser.serialize(root);

        Assertions.assertEquals(root.traversalInLevelOrder(), deser.deserialize(serialized).traversalInLevelOrder());

    }
}