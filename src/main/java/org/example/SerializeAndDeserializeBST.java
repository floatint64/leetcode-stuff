package org.example;

import org.example.common.TreeNode;

import java.nio.charset.StandardCharsets;

public class SerializeAndDeserializeBST {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        byte[] buffer = new byte[10000 * 6]; // nodes count * sizeOf(max(node.val))
        int[] offsetRef = {0};
        serializeSub(root, buffer, offsetRef);
        return new String(buffer, 0, offsetRef[0], StandardCharsets.ISO_8859_1);
    }

    private void serializeSub(TreeNode root, byte[] buffer, int[] offsetRef) {
        if (root == null) {
            ByteUtils.shortToBytes((short) -1, buffer, offsetRef); // возможно ошибка
            return;
        }
        serializeSub(root.left, buffer, offsetRef);
        serializeSub(root.right, buffer, offsetRef);

        ByteUtils.shortToBytes((short) root.val, buffer, offsetRef);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        byte[] buffer = data.getBytes(StandardCharsets.ISO_8859_1);
        int[] offsetIdx = {buffer.length - 1};
        return deserializeSub(buffer, offsetIdx);
    }

    private TreeNode deserializeSub(byte[] buffer, int[] offsetRef) {
        if (offsetRef[0] < 0) {
            return null;
        }

        short val = ByteUtils.bytesToShort(buffer, offsetRef);
        if (val < 0) {
            return null;
        }
        TreeNode root = new TreeNode(val);
        root.right = deserializeSub(buffer, offsetRef);
        root.left = deserializeSub(buffer, offsetRef);

        return root;
    }

    private static class ByteUtils {
        static void shortToBytes(short value, byte[] buffer, int[] offsetRef) {
            if (offsetRef[0] > buffer.length - 2) {
                return;
            }
            buffer[offsetRef[0]++] = (byte) ((value >> 8) & 0xFF);
            buffer[offsetRef[0]++] = (byte) (value & 0xFF);
        }

        static short bytesToShort(byte[] buffer, int[] offsetRef) {
            if (offsetRef[0] < 1) {
                return -1;
            }
            int h = buffer[offsetRef[0]--] & 0xFF;
            int l = buffer[offsetRef[0]--] & 0xFF;
            return (short)((l << 8) | h);
        }
    }
}
