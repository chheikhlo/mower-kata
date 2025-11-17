package com.github.romankh3.maventemplaterepository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Orientation enum.
 */
public class OrientationTest {

    // ----------------For turnLeft orientation---------------------
    @Test
    public void turnLeftFromNorthShouldReturnWest() {
        // from nord orientation
        Orientation orientation = Orientation.N;

        // turn to left
        Orientation result = orientation.turnLeft();

        // finally, face it to west ?
        Assertions.assertEquals(Orientation.W, result);
    }

    @Test
    public void turnLeftFromWestShouldReturnSouth() {
        // from west orientation
        Orientation orientation = Orientation.W;

        // turn to left
        Orientation result = orientation.turnLeft();

        // finally, face it to south ?
        Assertions.assertEquals(Orientation.S, result);
    }

    @Test
    public void turnLeftFromSouthShouldReturnEast() {
        // from south orientation
        Orientation orientation = Orientation.S;

        //turn to left
        Orientation result = orientation.turnLeft();

        // finally, face it to east ?
        Assertions.assertEquals(Orientation.E, result);
    }

    @Test
    public void turnLeftFromEastShouldReturnNorth() {
        // from east orientation
        Orientation orientation = Orientation.E;
        
        //turn to left
        Orientation result = orientation.turnLeft();

        // finally, face it to north ?
        Assertions.assertEquals(Orientation.N, result);
    }

    // ----------------For turnRight orientation---------------------
    @Test
    public void turnRightFromNorthShouldReturnEast() {
        // from north orientation
        Orientation orientation = Orientation.N;

        // turn to right
        Orientation result = orientation.turnRight();

        // finally, face it to east ?
        Assertions.assertEquals(Orientation.E, result);
    }

    @Test
    public void turnRightFromEastShouldReturnSouth() {
        // from east orientation
        Orientation orientation = Orientation.E;

        // turn to right
        Orientation result = orientation.turnRight();

        // finally, face it to south ?
        Assertions.assertEquals(Orientation.S, result);
    }

    @Test
    public void turnRightFromSouthShouldReturnWest() {
        // from south orientation
        Orientation orientation = Orientation.S;

        // turn to right
        Orientation result = orientation.turnRight();

        // finally, face it to west ?
        Assertions.assertEquals(Orientation.W, result);
    }

    @Test
    public void turnRightFromWestShouldReturnNorth() {
        // from west orientation
        Orientation orientation = Orientation.W;

        // turn to right
        Orientation result = orientation.turnRight();

        // finally, face it to north ?
        Assertions.assertEquals(Orientation.N, result);
    }
}
