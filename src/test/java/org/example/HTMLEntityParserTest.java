package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HTMLEntityParserTest {

    @Test
    void entityParser() {

        HTMLEntityParser parser = new HTMLEntityParser();

        String test = "&amp; is an HTML entity but &ambassador; is not.";
        String expected = "& is an HTML entity but &ambassador; is not.";

        Assertions.assertEquals(expected, parser.entityParser(test));
    }

    @Test
    void entityParser2() {

        HTMLEntityParser parser = new HTMLEntityParser();

        String test = "and I quote: &quot;...&quot;";
        String expected = "and I quote: \"...\"";

        Assertions.assertEquals(expected, parser.entityParser(test));
    }

    @Test
    void entityParser3() {

        HTMLEntityParser parser = new HTMLEntityParser();

        String test = "&lt;&lt;&lt;&lt;";
        String expected = "<<<<";

        Assertions.assertEquals(expected, parser.entityParser(test));
    }

    @Test
    void entityParser4() {

        HTMLEntityParser parser = new HTMLEntityParser();

        String test = "&&gt;";
        String expected = "&>";

        Assertions.assertEquals(expected, parser.entityParser(test));
    }

    @Test
    void entityParser5() {

        HTMLEntityParser parser = new HTMLEntityParser();

        String test = "&am&amp;";
        String expected = "&am&";

        Assertions.assertEquals(expected, parser.entityParser(test));
    }

    @Test
    void entityParser6() {

        HTMLEntityParser parser = new HTMLEntityParser();

        String test = "&&gt;";
        String expected = "&>";

        Assertions.assertEquals(expected, parser.entityParser(test));
    }

    @Test
    void entityParser7() {

        HTMLEntityParser parser = new HTMLEntityParser();

        String test = "&&&";
        String expected = "&&&";

        Assertions.assertEquals(expected, parser.entityParser(test));
    }
}