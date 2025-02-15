package collections.setinterface.unionandintersectionoftwosets;
import java.util.*;

public class IntersectionOfSets {
    public static HashSet<Integer> findIntersection(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
}
