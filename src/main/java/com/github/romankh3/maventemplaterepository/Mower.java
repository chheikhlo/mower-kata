package com.github.romankh3.maventemplaterepository;

/**
 * Mower on the lawn
 */
public class Mower {

    private Position position;
    private Orientation orientation;
    private final Lawn lawn;

    /**
     * Constructor to create a new mower with its initial position, orientation and lawn size.
     */
    public Mower(Position position, Orientation orientation, Lawn lawn) {
        this.position = position;
        this.orientation = orientation;
        this.lawn = lawn;
    }

    /**
     * Getter to Return the current orientation of the mower.
     */
    public Orientation getOrientation() {
        return orientation;
    }

    /**
     * Getter to Return the current position of the mower.
     */
    public Position getPosition() {
        return position;
    }

    /**
     * to turn mower to the left.
     */
    public void turnLeft() {
        this.orientation = this.orientation.turnLeft();
    }

    /**
     * to turn mower to the right.
     */
    public void turnRight() {
        this.orientation = this.orientation.turnRight();
    }

    /**
     * Move the mower one step forward based on the current orientation.
     */
    public void moveForward() {

        int newX = 0;
        int newY = 0;

        if (orientation == Orientation.N) {
            newY = 1;
        } else if (orientation == Orientation.E) {
            newX = 1;
        } else if (orientation == Orientation.S) {
            newY = -1;
        } else if (orientation == Orientation.W) {
            newX = -1;
        }

        Position newPosition = position.move(newX, newY);

        // move mower only if newPosition is inside the lawn
        if (lawn.isInside(newPosition)) {
            this.position = newPosition;
        }
    }

    public void executeCommands(String commands) {
        for (char c : commands.toCharArray()) {
            if (c == 'G') {
                turnLeft();
            } else if (c == 'D') {
                turnRight();
            } else if (c == 'A') {
                moveForward();
            }
        }
    }

}
