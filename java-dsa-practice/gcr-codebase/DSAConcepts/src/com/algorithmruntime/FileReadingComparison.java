package com.algorithmruntime;

import java.io.*;

public class FileReadingComparison {

    // -------- Using FileReader (Character Stream) --------
    static void readUsingFileReader(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        int ch;
        while ((ch = fr.read()) != -1) {
            // reading character by character
        }
        fr.close();
    }

    // -------- Using InputStreamReader (Byte Stream) --------
    static void readUsingInputStreamReader(String filePath) throws IOException {
        InputStreamReader isr =
                new InputStreamReader(new FileInputStream(filePath));
        int ch;
        while ((ch = isr.read()) != -1) {
            // reading byte stream converted to characters
        }
        isr.close();
    }

    public static void main(String[] args) throws IOException {

        String filePath = "largefile.txt"; // 1MB / 100MB / 500MB file

        // FileReader timing
        long start = System.currentTimeMillis();
        readUsingFileReader(filePath);
        long end = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (end - start) + " ms");

        // InputStreamReader timing
        start = System.currentTimeMillis();
        readUsingInputStreamReader(filePath);
        end = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (end - start) + " ms");
    }
    
    
}

