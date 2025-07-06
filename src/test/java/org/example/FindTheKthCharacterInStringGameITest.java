package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheKthCharacterInStringGameITest {

    @Test
    void kthCharacter() {
        FindTheKthCharacterInStringGameI find = new FindTheKthCharacterInStringGameI();

        Assertions.assertEquals('b', find.kthCharacter(5));
    }

    @Test
    void kthCharacter2() {
        FindTheKthCharacterInStringGameI find = new FindTheKthCharacterInStringGameI();

        Assertions.assertEquals('c', find.kthCharacter(10));
    }

    @Test
    void kthCharacter3() {
        FindTheKthCharacterInStringGameI find = new FindTheKthCharacterInStringGameI();

        Assertions.assertEquals('a', find.kthCharacter(1));
    }

    @Test
    void kthCharacter4() {
        FindTheKthCharacterInStringGameI find = new FindTheKthCharacterInStringGameI();

        Assertions.assertEquals('b', find.kthCharacter(2));
    }

    @Test
    void kthCharacter5() {
        FindTheKthCharacterInStringGameI find = new FindTheKthCharacterInStringGameI();

        Assertions.assertEquals('b', find.kthCharacter(3));
    }
}