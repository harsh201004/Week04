package collections.setinterface.unionandintersectionoftwosets;
import java.util.*;

public class UnionOfSets {
    public static HashSet<Integer> findUnion(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
}
