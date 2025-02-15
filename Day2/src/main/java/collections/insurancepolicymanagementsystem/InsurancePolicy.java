package collections.insurancepolicymanagementsystem;
import java.util.*;
import java.text.*;

public class InsurancePolicy implements Comparable<InsurancePolicy> {
     String policyNumber;
     String policyholderName;
     Date expiryDate;
     String coverageType;
     double premiumAmount;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public InsurancePolicy(String policyNumber, String policyholderName, String expiryDate, String coverageType, double premiumAmount) throws ParseException {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = dateFormat.parse(expiryDate);
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof InsurancePolicy)) return false;
        InsurancePolicy other = (InsurancePolicy) obj;
        return this.policyNumber.equals(other.policyNumber);
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + ", Name: " + policyholderName + ", Expiry: " + dateFormat.format(expiryDate) + ", Coverage: " + coverageType + ", Premium: $" + premiumAmount;
    }

}
