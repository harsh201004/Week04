package javastreams.filterstreams;
import java.io.*;

public class UppercaseToLowercase {
    public static void uppercaseToLowercase(String inputFile, String outputFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                // Convert each line to lowercase
                bw.write(line.toLowerCase());
                bw.newLine(); // Add newline after each line
            }

            System.out.println("File converted to lowercase and saved as " + outputFile);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
