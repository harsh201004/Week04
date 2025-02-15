package collections.listinterface.rotateelementsinlist;
import java.util.*;

public class RotateElementMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("After you enter all the numbers then type 'done' to stop:");
        System.out.println("Enter numbers:");
        while (input.hasNextInt()) {
            list.add(input.nextInt());
        }
        input.next();

        System.out.print("Enter number of positions to rotate: ");
        int positions = input.nextInt();

        List<Integer> rotatedList = RotateElements.rotateList(list, positions);
        System.out.println("Rotated List: " + rotatedList);

        input.close();
    }
}
