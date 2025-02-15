package collections.insurancepolicymanagementsystem;
import java.util.*;

public class ManagePolicy {
    private Set<InsurancePolicy> hashSetPolicies;
    private Set<InsurancePolicy> linkedHashSetPolicies;
    private Set<InsurancePolicy> treeSetPolicies;

    public ManagePolicy() {
        hashSetPolicies = new HashSet<>();
        linkedHashSetPolicies = new LinkedHashSet<>();
        treeSetPolicies = new TreeSet<>();
    }

    public void addPolicy(InsurancePolicy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("\n--- All Policies ---");
        for (InsurancePolicy policy : hashSetPolicies) {
            System.out.println(policy);
        }
    }

    public void displayPoliciesExpiringSoon() {
        System.out.println("\n--- Policies Expiring in 30 Days ---");
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, 30);
        Date thresholdDate = cal.getTime();

        for (InsurancePolicy policy : treeSetPolicies) {
            if (policy.getExpiryDate().before(thresholdDate)) {
                System.out.println(policy);
            }
        }
    }

    public void displayPoliciesByCoverageType(String coverageType) {
        System.out.println("\n--- Policies with Coverage Type: " + coverageType + " ---");
        for (InsurancePolicy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    public void displayDuplicatePolicies() {
        System.out.println("\n--- Duplicate Policies Based on Policy Number ---");
        Map<String, Integer> countMap = new HashMap<>();
        for (InsurancePolicy policy : hashSetPolicies) {
            countMap.put(policy.getPolicyNumber(), countMap.getOrDefault(policy.getPolicyNumber(), 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Policy Number: " + entry.getKey());
            }
        }
    }
}
