package com.github.romankh3.maventemplaterepository;

import java.util.List;

/**
 * Simulates all mowers moving on the lawn based on input lines.
 */
public class MowerSimulation {

    /**
     * to simulate all mowers based on the input lines.
     */
    public String simulate(List<String> lines) {
        InputParser parser = new InputParser();

        // parse lawn from first line
        String firstLine = lines.get(0);
        Lawn lawn = parser.parseLawn(firstLine);

        StringBuilder result = new StringBuilder();

        // one mower = 2 lines, start from line index 1
        for (int i = 1; i < lines.size(); i += 2) {
            // initial state line (position + orientation)
            String mowerLine = lines.get(i);

            // instructions line
            String instructions = lines.get(i + 1);

            // parse mower
            Mower mower = parser.parseMower(mowerLine, lawn);

            // execute instructions with the mower
            mower.instructionsMower(instructions);

            // get final state
            Position finalPosition = mower.getPosition();
            Orientation finalOrientation = mower.getOrientation();

            // define final position
            result.append(finalPosition.getX()).append(" ").append(finalPosition.getY()).append(" ").append(finalOrientation);

            // to always display result in new line
            if (i + 2 < lines.size()) {
                result.append("\n");
            }
        }

        return result.toString();
    }
}
