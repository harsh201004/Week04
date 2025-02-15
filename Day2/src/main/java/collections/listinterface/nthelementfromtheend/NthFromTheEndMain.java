package collections.listinterface.nthelementfromtheend;
import java.util.*;

public class NthFromTheEndMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("After all the elements type 'done' to stop");
        System.out.println("Enter elements: ");
        while (true) {
            String value = input.nextLine();
            if (value.equalsIgnoreCase("done")) {
                break;
            }
            linkedList.add(value);
        }

        System.out.print("Enter the value of N: ");
        int n = input.nextInt();

        String result = FindNthFromEnd.nthFromEnd(linkedList, n);
        System.out.println("Nth element from end: " + result);

        input.close();
    }
}
