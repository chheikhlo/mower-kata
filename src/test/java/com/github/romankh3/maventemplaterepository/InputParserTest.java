package com.github.romankh3.maventemplaterepository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the InputParser class.
 */
public class InputParserTest {

    @Test
    public void shouldParseMowerInitialState() {
        // init Lawn by (5,5)
        Lawn lawn = new Lawn(5, 5);

        // init mower based on secondLine 
        String secondLine = "1 2 N";

        // to create parser
        InputParser parser = new InputParser();

        // to parse mower
        Mower mower = parser.parseMower(secondLine, lawn);

        // check if position is x=1 and y=2
        Assertions.assertEquals(1, mower.getPosition().getX());
        Assertions.assertEquals(2, mower.getPosition().getY());

        // check if orientation is North
        Assertions.assertEquals(Orientation.N, mower.getOrientation());
    }
}
