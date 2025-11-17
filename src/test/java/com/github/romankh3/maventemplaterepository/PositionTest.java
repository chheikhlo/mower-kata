package com.github.romankh3.maventemplaterepository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Position class.
 */
public class PositionTest {

    @Test
    public void shouldMoveUp() {
        // (x=1, y=2)
        Position position = new Position(1, 2);

        // move by (NewX=0, NewY=1)
        Position newPosition = position.move(0, 1);

        // finally x=1+0=1 , y=2+1=3
        Assertions.assertEquals(1, newPosition.getX());
        Assertions.assertEquals(3, newPosition.getY());
    }

    @Test
    public void shouldMoveDown() {
        // (x=1, y=3)
        Position position = new Position(1, 3);

        // move by (NewX=0, NewY=-1)
        Position newPosition = position.move(0, -1);

        // finally x=1+0=1 , y=3-1=2
        Assertions.assertEquals(1, newPosition.getX());
        Assertions.assertEquals(2, newPosition.getY());
    }

    @Test
    public void shouldMoveRight() {
        // (x=2, y=2)
        Position position = new Position(2, 2);

        // move by (NewX=2, NewY=0)
        Position newPosition = position.move(2, 0);

        // finally x=2+2=4 , y=2+0=2
        Assertions.assertEquals(4, newPosition.getX());
        Assertions.assertEquals(2, newPosition.getY());
    }

    @Test
    public void shouldMoveLeft() {
        // (x=4, y=2)
        Position position = new Position(4, 2);

        // move by (NewX=-2, NewY=0)
        Position newPosition = position.move(-2, 0);

        // finally x=4-2=2 , y=2+0=2
        Assertions.assertEquals(2, newPosition.getX());
        Assertions.assertEquals(2, newPosition.getY());
    }
}
