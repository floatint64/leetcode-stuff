package org.example;

import org.example.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SerializeAndDeserializeBinaryTreeTest {
    @Test
    void serialize() {

        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), null);

        SerializeAndDeserializeBinaryTree serializeAndDeserializeBinaryTree = new SerializeAndDeserializeBinaryTree();

        Assertions.assertEquals("[1, 2, null, 3, null, null, null]", serializeAndDeserializeBinaryTree.serialize(root));
    }

    @Test
    void deserialize() {
        SerializeAndDeserializeBinaryTree serializeAndDeserializeBinaryTree = new SerializeAndDeserializeBinaryTree();

        String tree = "[1,2,2]";

        Assertions.assertEquals(List.of(1, 2, 2), serializeAndDeserializeBinaryTree.deserialize(tree).traversalInLevelOrder());
    }

    @Test
    void deserialize2() {
        SerializeAndDeserializeBinaryTree serializeAndDeserializeBinaryTree = new SerializeAndDeserializeBinaryTree();

        String tree = "[1,null,2]";

        Assertions.assertEquals(TreeNode.fromArray(new Integer[]{1, null, 2}).traversalInLevelOrder(), serializeAndDeserializeBinaryTree.deserialize(tree).traversalInLevelOrder());
    }

    @Test
    void deserialize3() {
        SerializeAndDeserializeBinaryTree serializeAndDeserializeBinaryTree = new SerializeAndDeserializeBinaryTree();

        String tree = "[1,2,null]";

        Assertions.assertEquals(TreeNode.fromArray(new Integer[]{1, 2, null}).traversalInLevelOrder(), serializeAndDeserializeBinaryTree.deserialize(tree).traversalInLevelOrder());
    }

    @Test
    void deserialize4() {
        SerializeAndDeserializeBinaryTree serializeAndDeserializeBinaryTree = new SerializeAndDeserializeBinaryTree();

        String tree = "[1,2,3,null,null,4,5]";

        Assertions.assertEquals(TreeNode.fromArray(new Integer[]{1, 2, 3, null, null, 4, 5}).traversalInLevelOrder(), serializeAndDeserializeBinaryTree.deserialize(tree).traversalInLevelOrder());
    }

    @Test
    void deserialize5() {
        SerializeAndDeserializeBinaryTree ser = new SerializeAndDeserializeBinaryTree();
        SerializeAndDeserializeBinaryTree deser = new SerializeAndDeserializeBinaryTree();


        TreeNode tree = new TreeNode(1, new TreeNode(2), null);

        Assertions.assertEquals(TreeNode.fromArray(new Integer[]{1, 2, null}).traversalInLevelOrder(), deser.deserialize(ser.serialize(tree)).traversalInLevelOrder());
    }
}