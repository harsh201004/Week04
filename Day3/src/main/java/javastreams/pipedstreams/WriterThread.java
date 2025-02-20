package javastreams.pipedstreams;
import java.io.*;

public class WriterThread extends Thread {
    private PipedOutputStream pipedOutputStream;

    public WriterThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        String data = "Hello from the Writer Thread!";
        try {
            pipedOutputStream.write(data.getBytes());
            pipedOutputStream.flush();  // Ensure all data is written
            System.out.println("Data written by WriterThread.");
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }
    }
}

