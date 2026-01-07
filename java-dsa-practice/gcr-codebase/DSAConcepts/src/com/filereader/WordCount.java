package com.filereader;

import java.io.*;

public class WordCount {

    public static void main(String[] args) {
        String targetWord = "Java"; // word to count
        int count = 0;

        try {
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // split by whitespace
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }

            br.close();
            fr.close();

            System.out.println("The word '" + targetWord + "' occurs " + count + " times.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

