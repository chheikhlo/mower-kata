package com.github.romankh3.maventemplaterepository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Mower class
 */
public class MowerTest {

    @Test
    public void shouldTurnLeft() {
        // init Lawn size
        Lawn lawn = new Lawn(5, 5);

        // init position (x=1, y=2)
        Position position = new Position(1, 2);
        
        // define orientation initial
        Orientation orientation = Orientation.N;

        // create mower
        Mower mower = new Mower(position, orientation, lawn);

        // indicate turn left direction for mower
        mower.turnLeft();

        // finally orientation must be West
        Assertions.assertEquals(Orientation.W, mower.getOrientation());
    }

    @Test
    public void shouldTurnRight() {
        // init Lawn size
        Lawn lawn = new Lawn(5, 5);

        // init position (x=1, y=2)
        Position position = new Position(1, 2);

        // define orientation initial
        Orientation orientation = Orientation.N;

        // create mower
        Mower mower = new Mower(position, orientation, lawn);

        // indicate turn right direction
        mower.turnRight();

        // finally orientation must be East
        Assertions.assertEquals(Orientation.E, mower.getOrientation());
    }

    @Test
    public void shouldMoveForwardInsideLawn() {
        // init Lawn size
        Lawn lawn = new Lawn(5, 5);

        // init position (x=1, y=2)
        Position position = new Position(1, 2);

        // define orientation initial
        Orientation orientation = Orientation.N;

        // create mower
        Mower mower = new Mower(position, orientation, lawn);

        // move forward to new position (newX=1, newY=3)
        mower.moveForward();

        // finally new position must be (x=1, y=3)
        Assertions.assertEquals(1, mower.getPosition().getX());
        Assertions.assertEquals(3, mower.getPosition().getY());
    }

    @Test
    public void shouldReachExpectedFinalPositionForFirstExample() {
        // init Lawn size (5,5)
        Lawn lawn = new Lawn(5, 5);

        // init position (1,2) and orientation N
        Position position = new Position(1, 2);
        Orientation orientation = Orientation.N;

        // create mower
        Mower mower = new Mower(position, orientation, lawn);

        // execute commands from the kata example
        mower.instructionsMower("GAGAGAGAA");

        // final state must be 1,3,N
        Assertions.assertEquals(1, mower.getPosition().getX());
        Assertions.assertEquals(3, mower.getPosition().getY());
        Assertions.assertEquals(Orientation.N, mower.getOrientation());
    }
}
