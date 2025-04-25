package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    void addBinary() {

        AddBinary addBinary = new AddBinary();

        String a = "111";
        String b = "101";

        Assertions.assertEquals("1100", addBinary.addBinary(a, b));
    }

    @Test
    void addBinary2() {

        AddBinary addBinary = new AddBinary();

        String a = "1";
        String b = "1";

        Assertions.assertEquals("10", addBinary.addBinary(a, b));
    }

    @Test
    void addBinary3() {

        AddBinary addBinary = new AddBinary();

        String a = "1111";
        String b = "1111";

        Assertions.assertEquals("11110", addBinary.addBinary(a, b));
    }

    @Test
    void addBinary4() {

        AddBinary addBinary = new AddBinary();

        String a = "1010";
        String b = "1011";

        Assertions.assertEquals("10101", addBinary.addBinary(a, b));
    }

    @Test
    void addBinary5() {

        AddBinary addBinary = new AddBinary();

        String a = "11";
        String b = "1";

        Assertions.assertEquals("100", addBinary.addBinary(a, b));
    }

    @Test
    void addBinary6() {

        AddBinary addBinary = new AddBinary();

        String a = "100";
        String b = "110010";

        Assertions.assertEquals("110110", addBinary.addBinary(a, b));
    }

    @Test
    void addBinary7() {

        AddBinary addBinary = new AddBinary();

        String a = "101111";
        String b = "10";

        Assertions.assertEquals("110001", addBinary.addBinary(a, b));
    }
}