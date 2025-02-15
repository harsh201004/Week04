package collections.setinterface.subsetofset;
import java.util.*;

public class IsSubset {
    public static boolean isSubset(HashSet<Integer> set1, HashSet<Integer> set2) {
        return set2.containsAll(set1);
    }
}
