package javastreams.pipedstreams;
import java.io.*;

public class ReaderThread extends Thread {
    private PipedInputStream pipedInputStream;

    public ReaderThread(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead = pipedInputStream.read(buffer);
            String data = new String(buffer, 0, bytesRead);
            System.out.println("Data read by ReaderThread: " + data);
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}
