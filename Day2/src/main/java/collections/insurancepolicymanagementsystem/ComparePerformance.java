package collections.insurancepolicymanagementsystem;
import java.util.*;

public class ComparePerformance {
    public static void comparePerformance() {
        int numPolicies = 10000;
        Set<InsurancePolicy> hashSet = new HashSet<>();
        Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
        Set<InsurancePolicy> treeSet = new TreeSet<>();

        System.out.println("\n--- Performance Comparison ---");

        long startTime, endTime;

        // HashSet - Add
        startTime = System.nanoTime();
        for (int i = 0; i < numPolicies; i++) {
            hashSet.add(new InsurancePolicy("P" + i, "Name" + i, "2025-12-31", "Auto", 500.0));
        }
        endTime = System.nanoTime();
        System.out.println("HashSet Add: " + (endTime - startTime) + " ns");

        // LinkedHashSet - Add
        startTime = System.nanoTime();
        for (int i = 0; i < numPolicies; i++) {
            linkedHashSet.add(new InsurancePolicy("P" + i, "Name" + i, "2025-12-31", "Auto", 500.0));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Add: " + (endTime - startTime) + " ns");

        // TreeSet - Add
        startTime = System.nanoTime();
        for (int i = 0; i < numPolicies; i++) {
            treeSet.add(new InsurancePolicy("P" + i, "Name" + i, "2025-12-31", "Auto", 500.0));
        }
        endTime = System.nanoTime();
        System.out.println("TreeSet Add: " + (endTime - startTime) + " ns");
    }

}
