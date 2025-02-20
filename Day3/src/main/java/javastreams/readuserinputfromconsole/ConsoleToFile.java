package javastreams.readuserinputfromconsole;
import java.io.*;

public class ConsoleToFile {
    public static void consoleToFile() {
        BufferedReader reader = null;
        FileWriter writer = null;

        try {
            // Reading user input from console
            reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Writing data to a file
            writer = new FileWriter("user_data.txt");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");

            System.out.println("Data successfully saved to user_data.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Failed to close resources: " + e.getMessage());
            }
        }
    }
}
