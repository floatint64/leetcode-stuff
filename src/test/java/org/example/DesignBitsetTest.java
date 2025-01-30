package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignBitsetTest {
    @Test
    void fix() {
        DesignBitset bitset = new DesignBitset(8);
        bitset.fix(1);
        bitset.fix(7);
        //bitset.unfix(1);
        //bitset.unfix(5);
        bitset.flip();
        //bitset.flip();

        String s = bitset.toString();

        int y = 0;

        throw new RuntimeException();
    }

    @Test
    void fix2() {
        DesignBitset bitset = new DesignBitset(2);
        bitset.flip(); // 1 1
        bitset.unfix(1); // 1 0
        Assertions.assertFalse(bitset.all());
        bitset.fix(1); // 1 1
        bitset.fix(1); // 1 1
        bitset.unfix(1); // 1 0
        Assertions.assertFalse(bitset.all());
        //bitset.unfix(1);
        //bitset.unfix(5);
        //bitset.flip();
        //bitset.flip();

        String s = bitset.toString();

        //int y = 0;
        throw new RuntimeException();
    }

    @Test
    void fix3() {
        DesignBitset bitset = new DesignBitset(90);
        bitset.flip(); // 1 1
        bitset.unfix(87); // 1 0
        Assertions.assertFalse(bitset.all());
        bitset.fix(60); // 1 1
        bitset.fix(80); // 1 1
        bitset.unfix(72); // 1 0
        Assertions.assertFalse(bitset.all());
        //bitset.unfix(1);
        //bitset.unfix(5);
        //bitset.flip();
        //bitset.flip();

        String s = bitset.toString();

        //int y = 0;
        throw new RuntimeException();
    }
}