package collections.listinterface.reversethelist;
import java.util.*;

public class ReverseTheListMain {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original ArrayList: " + arrayList);
        List<Integer> reversedArrayList = ReverseUsingArraylist.reverseUsingArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + reversedArrayList);

        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original LinkedList: " + linkedList);
        List<Integer> reversedLinkedList = ReverseUsingLinkedlist.reverse(linkedList);
        System.out.println("Reversed LinkedList: " + reversedLinkedList);
    }
}
