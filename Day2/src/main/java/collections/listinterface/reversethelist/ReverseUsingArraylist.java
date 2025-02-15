package collections.listinterface.reversethelist;
import java.util.*;

public class ReverseUsingArraylist {

    public static List<Integer> reverseUsingArrayList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
