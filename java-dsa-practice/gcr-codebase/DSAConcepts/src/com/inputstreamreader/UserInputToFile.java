package com.inputstreamreader;

import java.io.*;

public class UserInputToFile {

    public static void main(String[] args) {
        try {
            // Read from console
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // Write to file
            FileWriter fw = new FileWriter("output.txt", true); // true → append mode
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Enter text (type 'exit' to quit):");
            String line;

            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(line);
                bw.newLine(); // write each input as a new line
            }

            // Close resources
            bw.close();
            fw.close();
            br.close();
            isr.close();

            System.out.println("Input saved to output.txt successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
