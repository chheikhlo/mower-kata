package com.github.romankh3.maventemplaterepository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Integration tests for the full mower simulation.
 */
public class MowerSimulationTest {

    @Test
    public void toSimulate() {
        List<String> lines = Arrays.asList(
                "5 5",
                "1 2 N",
                "GAGAGAGAA",
                "3 3 E",
                "AADAADADDA"
        );

        // to create simulation
        MowerSimulation simulation = new MowerSimulation();

        // to simulate all mowers
        String result = simulation.simulate(lines);
        System.out.println(result);

        // expected final positions like from the kata description
        String expected = "1 3 N\n5 1 E";

        // then result must be exactly the same
        Assertions.assertEquals(expected, result);
    }
}
