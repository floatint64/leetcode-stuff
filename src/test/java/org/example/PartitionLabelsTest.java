package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartitionLabelsTest {

    @Test
    void partitionLabels() {
        PartitionLabels partitionLabels = new PartitionLabels();
        String s = "ababcbacadefegdehijhklij";

        Assertions.assertEquals(List.of(9, 7,8), partitionLabels.partitionLabels(s));
    }

    @Test
    void partitionLabels2() {
        PartitionLabels partitionLabels = new PartitionLabels();
        String s = "qiejxqfnqceocmy";

        Assertions.assertEquals(List.of(13, 1, 1), partitionLabels.partitionLabels(s));
    }
}