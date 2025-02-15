package collections.listinterface.reversethelist;
import java.util.*;

public class ReverseUsingLinkedlist {
   // public static LinkedList<Integer> reversedLinkedList(LinkedList<Integer> list) {

   public static List<Integer> reverse(List<Integer> list){
       List<Integer> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
