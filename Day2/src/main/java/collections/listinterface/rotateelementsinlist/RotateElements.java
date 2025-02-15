package collections.listinterface.rotateelementsinlist;
import java.util.*;

public class RotateElements {
    public static List<Integer> rotateList(List<Integer> list, int positions) {
        int size = list.size();
        if (size == 0) {
            return list;
        }

        positions = positions % size;
        List<Integer> rotatedList = new ArrayList<>();

        // Add rotated elements first
        rotatedList.addAll(list.subList(positions, size));

        // Add initial elements to the end
        rotatedList.addAll(list.subList(0, positions));

        return rotatedList;
    }
}
