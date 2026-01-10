package com.algorithm.utilityclasses.stringbuffer;
public class StringBufferVsStringBuilder {
    public static void main(String[] args) {

        int count = 1_000_000;
        String text = "hello";

        // ---------- StringBuilder ----------
        StringBuilder sb = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < count; i++) {
            sb.append(text);
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // ---------- StringBuffer ----------
        StringBuffer sbuf = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < count; i++) {
            sbuf.append(text);
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        // ---------- Results ----------
        System.out.println("StringBuilder Time: " + builderTime + " ns");
        System.out.println("StringBuffer Time : " + bufferTime + " ns");

        if (builderTime < bufferTime) {
            System.out.println("StringBuilder is faster.");
        } else {
            System.out.println("StringBuffer is faster.");
        }
    }
}