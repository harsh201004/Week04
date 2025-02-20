package javastreams.filehandling;

public class FileReadWriteMain {
    public static void main(String[] args) {
        String sourceFile = "inputfile1.txt";
        String destinationFile = "outputfile1";

        FileReadWrite.fileReadWrite(sourceFile, destinationFile);
    }
}
