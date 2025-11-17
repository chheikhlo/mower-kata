package com.github.romankh3.maventemplaterepository;

/**
 * possibles orientation of the mower
 */
public enum Orientation {
    N,E,S,W;

    /**
     * Define right orientation after turning left
     */
    public Orientation turnLeft() {
        switch (this) {
            case N:
                return W;
            case W:
                return S;
            case S:
                return E;
            case E:
                return N;
            default:
                return this;
        }
    }

    /**
     * Define right orientation after turning right
     */
    public Orientation turnRight() {
        switch (this) {
            case N:
                return E;
            case E:
                return S;
            case S:
                return W;
            case W:
                return N;
            default:
                return this;
        }
    }
}
