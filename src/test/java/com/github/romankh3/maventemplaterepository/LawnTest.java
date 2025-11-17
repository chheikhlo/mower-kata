package com.github.romankh3.maventemplaterepository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Lawn class.
 */
public class LawnTest {

    @Test
    public void shouldReturnTrueWhenPositionIsInsideLawn() {
        // (maxX=5, maxY=5)
        Lawn lawn = new Lawn(5, 5);

        // position (x=3, y=4), is it inside ?
        Position position = new Position(3, 4);

        // should be inside
        boolean inside = lawn.isInside(position);

        // finally, must be true
        Assertions.assertTrue(inside);
    }

    @Test
    public void shouldReturnFalseWhenPositionIsOutsideLawn() {
        // (maxX=5, maxY=5)
        Lawn lawn = new Lawn(5, 5);

        // position (x=6, y=3), is it inside ?
        Position position = new Position(6, 3);

        // should be outside
        boolean inside = lawn.isInside(position);

        // finally, must be false
        Assertions.assertFalse(inside);
    }
}
