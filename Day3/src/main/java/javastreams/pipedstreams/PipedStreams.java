package javastreams.pipedstreams;
import java.io.*;

public class PipedStreams {
    public static void main(String[] args) {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream();

        try {
            pipedInputStream.connect(pipedOutputStream);

            WriterThread writerThread = new WriterThread(pipedOutputStream);
            ReaderThread readerThread = new ReaderThread(pipedInputStream);

            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error during communication: " + e.getMessage());
        }
    }
}
