package com.generics.resumescreeningsystem;
import java.util.List;

public class ScreeningUtils {

    public static <T extends JobRole> void applyAIFilter(Resume<T> resume) {
        System.out.println("\nAI analyzing resume...");
        resume.process();
    }

    public static void batchScreen(List<? extends JobRole> roles) {
        System.out.println("\nBatch Screening Started:");
        for (JobRole role : roles) {
            role.evaluateResume();
        }
    }
}
