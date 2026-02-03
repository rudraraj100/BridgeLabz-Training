package com.lambaexpression.lightingautomation;

/*
Smart Home Lighting Automation
○ Scenario: A building has smart lights. Different triggers (motion, time of day, voice
commands) need to execute different light patterns.
○ Task: Use lambdas to define these light activation behaviors dynamically without
creating multiple classes.
*/

import java.util.Scanner;

interface LightPattern {
    void pattern(String command);
}



public class LightingAutomation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine().trim().toLowerCase();

        LightPattern pattern1 = (commands) -> {

            if (commands.equals("motion")) {
                System.out.println("Bulb showing different colour in motion");
            }
            else if (commands.equals("evening")) {
                System.out.println("Bulb showing evening warm colour");
            }
            else if (commands.equals("blue")) {
                System.out.println("Bulb showing blue colour in motion");
            }
            else {
                System.out.println("Wrong input");
            }
        };

        pattern1.pattern(command);
        sc.close();
    }
}
