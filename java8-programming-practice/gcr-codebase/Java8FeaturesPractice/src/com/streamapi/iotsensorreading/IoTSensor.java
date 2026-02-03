package com.streamapi.iotsensorreading;
import java.util.*;

public class IoTSensor {

    public static void main(String[] args) {

        List<Double> readings = Arrays.asList(
                22.5,
                35.8,
                28.3,
                41.2,
                19.6,
                38.9
        );

        double threshold = 30.0;

        System.out.println("Sensor readings above threshold:");

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r ->
                        System.out.println("Reading: " + r)
                );
    }
}
