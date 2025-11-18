package com.github.romankh3.maventemplaterepository;

/**
 * class to parse input lines from the file
 */
public class InputParser {

    /**
     * parse first line to create an Lawn.
     */
    public Lawn parseLawn(String firstLine) {
        String[] coordinates = firstLine.trim().split(" ");

        // first value is max X and second is max Y
        int maxX = Integer.parseInt(coordinates[0]);
        int maxY = Integer.parseInt(coordinates[1]);

        // return lawn created
        return new Lawn(maxX, maxY);
    }

    /**
     * parse second line corresponding to the mower state
     */
    public Mower parseMower(String secondLine, Lawn lawn) {
        String[] coordinates = secondLine.trim().split(" ");

        // x and y Mower coordinates
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);

        // define orientation
        Orientation orientation = Orientation.valueOf(coordinates[2]);

        // to create position and mower
        Position position = new Position(x, y);
        return new Mower(position, orientation, lawn);
    }
}
