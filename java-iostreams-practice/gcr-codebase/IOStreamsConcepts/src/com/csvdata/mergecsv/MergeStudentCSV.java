package com.csvdata.mergecsv;

import java.io.*;
import java.util.HashMap;

public class MergeStudentCSV {

    public static void main(String[] args) {

        String file1 = "CSVData/mergeData/student1.csv";
        String file2 = "CSVData/mergeData/student2.csv";
        String output = "CSVData/mergeData/merged_students.csv";

        HashMap<String, String[]> map = new HashMap<>();

        try (
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            FileWriter writer = new FileWriter(output)
        ) {

            String line;

            // skip header of first file
            br1.readLine();

            // load students1.csv
            while ((line = br1.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    map.put(data[0], data);
                }
            }

            // write output header
            writer.write("ID,Name,Age,Marks,Grade\n");

            // skip header of second file
            br2.readLine();

            // merge with students2.csv
            while ((line = br2.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3 && map.containsKey(data[0])) {
                    String[] s = map.get(data[0]);
                    writer.write(
                        s[0] + "," + s[1] + "," + s[2] + "," +
                        data[1] + "," + data[2] + "\n"
                    );
                }
            }

            System.out.println("CSV files merged successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
