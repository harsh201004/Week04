package resumescreeningsystemtest;

import org.junit.Test;
import org.junit.Assert;
import resumescreeningsystem.SoftwareEngineer;
import resumescreeningsystem.DataScientist;
import resumescreeningsystem.ProductManager;
import resumescreeningsystem.Resume;



public class ResumeScreeningSystemTest {
    @Test
    public void test1() {
        // Test for SoftwareEngineerResumes
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        SoftwareEngineer amitResume = new SoftwareEngineer("Amit", "Java, Python, C++");
        softwareEngineerResumes.addResume(amitResume);
        Assert.assertEquals(1, softwareEngineerResumes.getResumes().size());

    }

    @Test
    public void test2() {
        // Test for DataScientistResumes
        Resume<DataScientist> dataScientistResumes = new Resume<>();
        DataScientist priyaResume = new DataScientist("Priya", "Python, R, Machine Learning");
        dataScientistResumes.addResume(priyaResume);
        Assert.assertEquals("Priya", dataScientistResumes.getResumes().get(0).getCandidateName());

    }

    @Test
    public void test3() {
        // Test for ProductManagerResumes
        Resume<ProductManager> productManagerResumes = new Resume<>();
        ProductManager nehaResume = new ProductManager("Neha", "Product Lifecycle, Roadmapping, Agile");
        productManagerResumes.addResume(nehaResume);
        Assert.assertEquals("Neha", productManagerResumes.getResumes().get(0).getCandidateName());

    }
}
