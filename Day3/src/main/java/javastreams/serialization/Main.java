package javastreams.serialization;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter employee details (Enter 'exit' as name to stop):");
        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) break;

            System.out.print("Enter ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter department: ");
            String department = scanner.nextLine();

            System.out.print("Enter salary: ");
            double salary = Double.parseDouble(scanner.nextLine());

            employees.add(new Employee(id, name, department, salary));
        }

        // Serialize the list of employees
        SaveAndRetrieveObject.serializeEmployees(employees);

        // Deserialize and display the employees
        List<Employee> deserializedEmployees = SaveAndRetrieveObject.deserializeEmployees();
        System.out.println("\nDeserialized Employee Data:");
        for (Employee emp : deserializedEmployees) {
            System.out.println(emp);
        }

        scanner.close();
    }
}
