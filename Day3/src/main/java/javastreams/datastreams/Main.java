package javastreams.datastreams;

public class Main {
    public static void main(String[] args) {
        String fileName = "student_data.dat";

        // Writing student data to the binary file
        StoreAndRetrievePrimitiveData.writeStudentData(fileName);

        // Reading student data from the binary file
        StoreAndRetrievePrimitiveData.readStudentData(fileName);

    }
}
