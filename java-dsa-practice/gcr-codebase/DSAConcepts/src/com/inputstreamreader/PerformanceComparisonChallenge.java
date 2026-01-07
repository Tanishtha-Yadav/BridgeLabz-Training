package com.inputstreamreader;

import java.io.*;

public class PerformanceComparisonChallenge {

    public static void main(String[] args) {
        int n = 1_000_000;
        String text = "hello";

        // ===== StringBuffer =====
        long startBuffer = System.nanoTime();
        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuffer.append(text);
        }
        long endBuffer = System.nanoTime();
        System.out.println("StringBuffer Time (ms): " + (endBuffer - startBuffer) / 1_000_000);

        // ===== StringBuilder =====
        long startBuilder = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbuilder.append(text);
        }
        long endBuilder = System.nanoTime();
        System.out.println("StringBuilder Time (ms): " + (endBuilder - startBuilder) / 1_000_000);

        // ===== FileReader =====
        try {
            long startFR = System.nanoTime();
            FileReader fr = new FileReader("largefile.txt");
            BufferedReader br = new BufferedReader(fr);
            int wordCountFR = 0;
            String line;
            while ((line = br.readLine()) != null) {
                wordCountFR += line.split("\\s+").length;
            }
            br.close();
            fr.close();
            long endFR = System.nanoTime();
            System.out.println("FileReader Word Count: " + wordCountFR);
            System.out.println("FileReader Time (ms): " + (endFR - startFR) / 1_000_000);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ===== InputStreamReader =====
        try {
            long startISR = System.nanoTime();
            FileInputStream fis = new FileInputStream("largefile.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            int wordCountISR = 0;
            String line;
            while ((line = br.readLine()) != null) {
                wordCountISR += line.split("\\s+").length;
            }
            br.close();
            isr.close();
            fis.close();
            long endISR = System.nanoTime();
            System.out.println("InputStreamReader Word Count: " + wordCountISR);
            System.out.println("InputStreamReader Time (ms): " + (endISR - startISR) / 1_000_000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
