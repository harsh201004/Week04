package javastreams.filterstreams;

public class UppercaseToLowercaseMain {
    public static void main(String[] args) {
        String inputFile = "inputfile1.txt";
        String outputFile = "output.txt";

        UppercaseToLowercase.uppercaseToLowercase(inputFile, outputFile);
    }
}
