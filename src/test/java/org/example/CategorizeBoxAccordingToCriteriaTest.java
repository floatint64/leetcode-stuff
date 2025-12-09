package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategorizeBoxAccordingToCriteriaTest {

    @Test
    void categorizeBox() {
        CategorizeBoxAccordingToCriteria category = new CategorizeBoxAccordingToCriteria();
        int length = 1000, width = 35, height = 700, mass = 300;
        String expected = "Heavy";

        Assertions.assertEquals(expected, category.categorizeBox(length,width,height,mass));
    }

    @Test
    void categorizeBox2() {
        CategorizeBoxAccordingToCriteria category = new CategorizeBoxAccordingToCriteria();
        int length = 200, width = 50, height = 800, mass = 50;
        String expected = "Neither";

        Assertions.assertEquals(expected, category.categorizeBox(length,width,height,mass));
    }

    @Test
    void categorizeBox3() {
        CategorizeBoxAccordingToCriteria category = new CategorizeBoxAccordingToCriteria();
        int length = 2909, width = 3968, height = 3272, mass = 727;
        String expected = "Both";

        Assertions.assertEquals(expected, category.categorizeBox(length,width,height,mass));
    }
}