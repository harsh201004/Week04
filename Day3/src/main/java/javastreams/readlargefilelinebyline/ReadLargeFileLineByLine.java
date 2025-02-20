package javastreams.readlargefilelinebyline;
import java.io.*;

public class ReadLargeFileLineByLine {
    public static void readlargefile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Check if the line contains "error" (case-insensitive)
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
