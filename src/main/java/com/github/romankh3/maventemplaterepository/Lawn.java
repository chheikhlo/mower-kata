package com.github.romankh3.maventemplaterepository;

/**
 * The lawn area where the mower move.
 */
public class Lawn {

    private final int maxX;
    private final int maxY;

    /**
     * Constructor to create a new Lawn with the given coordinates.
     */
    public Lawn(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    /**
     * to check if the given position is inside or outside the lawn.
     */
    public boolean isInside(Position position) {
        int x = position.getX();
        int y = position.getY();

        if (x < 0 || y < 0 || x > maxX || y > maxY) {
            return false;
        }

        return true;
    }
}
