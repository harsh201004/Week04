package collections.setinterface.symmentricdifference;
import java.util.*;

public class SymmentricDifference {
    public static HashSet<Integer> findSymmetricDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> diff1 = new HashSet<>(set1);
        diff1.removeAll(set2); // Elements in set1 but not in set2

        HashSet<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1); // Elements in set2 but not in set1

        diff1.addAll(diff2); // Union of the two differences
        return diff1;
    }
}
