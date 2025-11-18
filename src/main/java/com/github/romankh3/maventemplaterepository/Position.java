package com.github.romankh3.maventemplaterepository;

/**
 * position on the grid.
 */
public class Position {

    private final int x;
    private final int y;

    /**
     * Constructor to create a new Position with the given coordinates
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter to return the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Getter to Return the y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * to return a new position moved by newX and newY.
     */
    public Position move(int newX, int newY) {
        return new Position(x + newX, y + newY);
    }
}
